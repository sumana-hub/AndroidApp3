package com.trios2024evsd.treasurehuntapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEditText = findViewById<EditText>(R.id.name_edit_text)
        val phoneEditText = findViewById<EditText>(R.id.phone_edit_text)
        val startButton = findViewById<Button>(R.id.start_button)

        startButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val phone = phoneEditText.text.toString()

            if (name.isNotEmpty() && phone.isNotEmpty()) {
                val intent = Intent(this, GameActivity::class.java)
                intent.putExtra("USER_NAME", name)
                intent.putExtra("USER_PHONE", phone)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Please enter your name and phone number", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
