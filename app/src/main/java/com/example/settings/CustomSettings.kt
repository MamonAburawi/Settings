package com.example.settings

data class CustomSettings(
    val user: User,
    val color: String? = null,
    val notifyState: Boolean,
    val notifySound: Boolean
)
