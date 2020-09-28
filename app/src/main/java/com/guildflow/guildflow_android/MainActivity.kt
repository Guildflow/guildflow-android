package com.guildflow.guildflow_android

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import com.guildflow.guildflow_android.events.EventsScreen
import com.guildflow.guildflow_android.events.EventsViewModel
import com.guildflow.guildflow_android.ui.GuildflowTheme

class MainActivity : AppCompatActivity() {

    private val eventsViewModel by viewModels<EventsViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // FIXME: Temp loading fake events here feels odd, but satisfies current demo.
        eventsViewModel.loadEvents()

        setContent {
            GuildflowTheme {
                GuildflowApp()
            }
        }
    }

    @Composable
    fun GuildflowApp() {
        Scaffold(
                topBar = {
                    TopAppBar(
                            title = {
                                Text(text = "Guildflow")
                            },
                            actions = {
                                IconButton(onClick = { /* doSomething() */ }) {
                                    Icon(Icons.Filled.Favorite)
                                }
                            }
                    )
                }
        ) { innerPadding ->
            EventsScreen(items = eventsViewModel.events)
        }
    }
}
