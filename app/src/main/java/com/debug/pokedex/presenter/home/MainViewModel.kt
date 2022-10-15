package com.debug.pokedex.presenter.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.debug.pokedex.data.PokemonRemote
import com.debug.pokedex.network.PokemonApi
import com.debug.pokedex.network.ServiceProvider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val _pokemons = MutableLiveData<List<PokemonRemote>>()
    val pokemons: LiveData<List<PokemonRemote>> = _pokemons

    fun getPokemonList() {
        viewModelScope.launch(Dispatchers.IO) {
            _pokemons.postValue(
                ServiceProvider.getService(PokemonApi::class.java).getPokemonList()
            )
        }
    }
}