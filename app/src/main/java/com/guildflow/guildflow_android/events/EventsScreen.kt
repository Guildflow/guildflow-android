package com.guildflow.guildflow_android.events

import androidx.compose.foundation.Text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ColumnScope.weight
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

@Composable
fun EventsScreen(
        items: List<Event>,
) {
    LazyColumnFor(
        items = items,
        modifier = Modifier.weight(1f),
        contentPadding = PaddingValues(top = 8.dp)
    ) { event ->
        EventRow(
            event = event,
            onItemClicked = { /* todo */ },
            modifier = Modifier.fillParentMaxWidth()
        )
    }
}

@Composable
fun EventRow(
    event: Event,
    onItemClicked: (Event) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier
            .clickable { onItemClicked(event) }
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(event.title)
    }
}

@Preview
@Composable
fun PreviewEventScreen() {
    val items = listOf(
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
    EventsScreen(items)
}