package com.example.simplechoices

import androidx.compose.runtime.mutableStateListOf

class DecisionRepository {
    private val _decisions = mutableStateListOf(
        Decision("YES", 65),
        Decision("MEH", 35),
        Decision("NO", 15)
    )

    // This makes a safer read only list
    val decisions: List<Decision> get() = _decisions
}