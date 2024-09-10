package br.senai.sp.jandira.rickyandmorty.service

import br.senai.sp.jandira.rickyandmorty.model.Character
import br.senai.sp.jandira.rickyandmorty.model.Episode
import br.senai.sp.jandira.rickyandmorty.model.Result
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterService {
    @GET("character/")
    fun getAllCharacters(): Call<Result>

    @GET("character/{id}/")
    fun getCharacterById(@Path("id") id: Int): Call<Character>

    @GET("episode/{id}/")
    fun getEpisodeById(@Path("id") id: Int): Call<Episode>
}