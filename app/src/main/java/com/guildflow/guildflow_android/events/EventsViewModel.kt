package com.guildflow.guildflow_android.events

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class EventsViewModel : ViewModel() {

    var events by mutableStateOf(listOf<Event>())
        private set

    // TODO (b/163069767): mutableStateListOf crashes LazyColumnFor when removing items
    //var events = mutableStateListOf<Event>().also { loadEvents() }

    fun loadEvents() {
        events = events.toMutableList().also {
            it.addAll(
                listOf(
                    Event("Let's Watch Goodfellas"),
                    Event("Intro to Film"),
                    Event("The Joys of Popcorn"),
                    Event("Transformers: The Movie, More than a toy ad?"),
                    Event("Let's Watch Goodfellas"),
                    Event("Intro to Film"),
                    Event("The Joys of Popcorn"),
                    Event("Transformers: The Movie, More than a toy ad?"),
                    Event("Let's Watch Goodfellas"),
                    Event("Intro to Film"),
                    Event("The Joys of Popcorn"),
                    Event("Transformers: The Movie, More than a toy ad?"),
                    Event("Let's Watch Goodfellas"),
                    Event("Intro to Film"),
                    Event("The Joys of Popcorn"),
                    Event("Transformers: The Movie, More than a toy ad?"),
                    Event("Let's Watch Goodfellas"),
                    Event("Intro to Film"),
                    Event("The Joys of Popcorn"),
                    Event("Transformers: The Movie, More than a toy ad?"),
                    Event("Let's Watch Goodfellas"),
                    Event("Intro to Film"),
                    Event("The Joys of Popcorn"),
                    Event("Transformers: The Movie, More than a toy ad?"),
                    Event("Let's Watch Goodfellas"),
                    Event("Intro to Film"),
                    Event("The Joys of Popcorn"),
                    Event("Transformers: The Movie, More than a toy ad?"),
                )
            )
        }
    }

}