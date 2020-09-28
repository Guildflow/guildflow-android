package com.guildflow.guildflow_android.events

import java.util.*

data class Event(
        val title: String,
        val id: UUID = UUID.randomUUID()
)