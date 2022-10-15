package com.debug.pokedex.presenter.home

import android.os.Build.VERSION.SDK_INT
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import coil.ImageLoader
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import coil.load
import com.debug.pokedex.R
import com.debug.pokedex.databinding.FragmentMainBinding
import com.debug.pokedex.presenter.home.adapter.PokemonAdapter
import com.debug.pokedex.presenter.home.model.PokemonListScreenState
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        viewModel.getPokemonList()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setObservers()
    }

    private fun setObservers() {
        viewModel.pokemons.observe(viewLifecycleOwner) {
            binding.pokemons.adapter = PokemonAdapter(it) { pokemon ->
                //go to pokemon detail
            }
        }

        viewModel.screenState.observe(viewLifecycleOwner) {
            setViewState(it)
        }
    }

    private fun setViewState(state: PokemonListScreenState) {
        when (state) {
            PokemonListScreenState.LOADING -> loadingContent()
            PokemonListScreenState.CONTENT -> showContent()
        }
    }

    private fun showContent() {
        binding.loadingImage.isVisible = false
        binding.pokemons.isVisible = true
    }

    private fun loadingContent() {
        val imageLoader = ImageLoader.Builder(requireContext())
            .components {
                if (SDK_INT >= 28) {
                    add(ImageDecoderDecoder.Factory())
                } else {
                    add(GifDecoder.Factory())
                }
            }
            .build()

        binding.loadingImage.load(
             R.drawable.pikachu_running,
            imageLoader = imageLoader
        )

        binding.loadingImage.isVisible = true
        binding.pokemons.isVisible = false
    }

}