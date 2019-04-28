package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roll_button.text = getString(R.string.let_roll)

        roll_button.setOnClickListener {
            Toast.makeText(this, "Hello Rolling", Toast.LENGTH_LONG).show()
            rollDice()}
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        result_text.text = "$randomInt"
    }
}
