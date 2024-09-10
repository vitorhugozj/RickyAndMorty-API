package br.senai.sp.jandira.rickyandmorty.model

import android.media.Image
import javax.net.ssl.SSLEngineResult.Status

data class Character(
    val id: Int = 0,
    val name: String = "",
    val status: String = "",
    val species: String = "",
    val type: String = "",
    val gender: String = "",
    val origin: Origin = Origin(),
    val location: Location = Location(),
    val image: String = "",
    val episode: List<String> = listOf<String>(),
    val url: String = "",
    val created: String = ""
)