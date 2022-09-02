package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rollButton: Button = findViewById(R.id.rollButton)
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()

            val numRange = (1..6)
            val number = numRange.random()

            val diceImage: ImageView = findViewById(R.id.DiceImage)

            if (number == 1) {
                diceImage.setImageResource(R.drawable.dice_1)
            } else if (number == 2) {
                diceImage.setImageResource(R.drawable.dice_2)
            } else if (number == 3) {
                diceImage.setImageResource(R.drawable.dice_3)
            } else if (number == 4) {
                diceImage.setImageResource(R.drawable.dice_4)
            } else if (number == 5) {
                diceImage.setImageResource(R.drawable.dice_5)
            } else {
                diceImage.setImageResource(R.drawable.dice_6)
            }
        }
    }
}