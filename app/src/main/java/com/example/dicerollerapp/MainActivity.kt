package com.example.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dice: Dice = Dice(6)
        val result: Int = dice.rollDice()
        print(result)
    }
}