package com.debug.pokedex.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.debug.pokedex.network.PokemonApi
import com.debug.pokedex.network.ServiceProvider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    fun getPokemonList(){
        viewModelScope.launch(Dispatchers.IO) {
            val list = ServiceProvider.getService(PokemonApi::class.java).getPokemonList()

            println(list)
        }
    }
}