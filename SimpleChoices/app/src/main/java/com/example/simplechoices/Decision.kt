package com.example.simplechoices

class Decision (
    private val choiceName: String,
    private val percentage: Int
) {
    fun getPercentage(): Int {
        return this.percentage
    }

    fun getChoiceName(): String {
        return this.choiceName
    }
}