package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roll_button.text = getString(R.string.let_roll)

        roll_button.setOnClickListener {
            Toast.makeText(
                this,
                "Hello Rolling",
                Toast.LENGTH_LONG
        ).show() }
    }
}
