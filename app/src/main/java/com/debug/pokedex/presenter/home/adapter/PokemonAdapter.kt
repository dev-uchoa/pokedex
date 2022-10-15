package com.debug.pokedex.presenter.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.debug.pokedex.data.PokemonRemote
import com.debug.pokedex.databinding.ItemPokemonBinding

class PokemonAdapter(
    private val dataSet: List<PokemonRemote>,
    private val onClickItem: (PokemonRemote) -> Unit
) :
    RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemPokemonBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }

    override fun getItemCount() = dataSet.size

    inner class ViewHolder(private val binding: ItemPokemonBinding) : RecyclerView.ViewHolder(binding.root) {

        init {
            itemView.setOnClickListener {
                onClickItem(dataSet[adapterPosition])
            }
        }

        fun bind(pokemon: PokemonRemote) {
            binding.apply {
                pokeId.text = "#${pokemon.id.toString().padStart(3, '0')}"
                pokeName.text = pokemon.name
                pokemonImage.load(pokemon.image)
            }
        }

    }

}