package br.senai.sp.jandira.rickyandmorty

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.rickyandmorty.ui.theme.RickyAndMortyTheme
import br.senai.sp.rickandmorty.screens.CharacterList


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RickyAndMortyTheme {
                val controleDeNavegacao = rememberNavController()

                NavHost(
                    navController = controleDeNavegacao,
                    startDestination = "characterList"
                )
                {
                    composable("characterList") {
                        CharacterList(controleDeNavegacao)
                    }
                    composable(
                        route = "characterDetails/{id}"
                    ) { backStackEntry ->
                        val id = backStackEntry.arguments?.getString("id")
                        CharacterDetails(controleDeNavegacao, id)
                    }

                }
            }
        }
    }
}
