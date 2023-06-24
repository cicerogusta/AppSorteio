package com.cicerodev.sorteioprojeto.activity

import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainActivityViewModel: ViewModel() {
    fun getRandomNumber(): Int {
        return Random.nextInt(11)
    }
}