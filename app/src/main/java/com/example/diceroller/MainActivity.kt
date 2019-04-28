package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var random: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roll_button.text = getString(R.string.let_roll)

        roll_button.setOnClickListener {
            Toast.makeText(this, "Hello Rolling", Toast.LENGTH_LONG).show()
            rollDice()}
    }

    private fun generateNum() = Random().nextInt(6) + 1

    private fun rollDice() {
        random = generateNum()

        val drawableResource = when(random) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        dice_image.setImageDrawable(getDrawable(drawableResource))
    }
}
