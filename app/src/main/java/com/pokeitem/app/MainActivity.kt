package com.pokeitem.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.pokeitem.app.ui.navigation.PokeItemNavGraph
import com.pokeitem.app.ui.theme.PokeItemTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PokeItemTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    PokeItemNavGraph()
                }
            }
        }
    }
}
