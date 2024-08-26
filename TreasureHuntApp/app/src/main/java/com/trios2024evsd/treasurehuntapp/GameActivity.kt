package com.trios2024evsd.treasurehuntapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {

    private val locations = listOf(
        "City Hall",
        "Local Bakery",
        "Coffee Shop",
        "Museum",
        "Library",
        "Bookstore",
        "Park",
        "Gym",
        "Shopping Mall",
        "Cinema",
        "Restaurant",
        "Hotel",
        "Music Store",
        "Art Gallery",
        "Theater",
        "Supermarket",
        "Florist",
        "Pharmacy",
        "Bank",
        "Train Station"
    )

    private var currentLocationIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val userName = intent.getStringExtra("USER_NAME")

        findViewById<TextView>(R.id.user_info_text).text = "Welcome, $userName"

        showNextLocation()

        findViewById<Button>(R.id.next_button).setOnClickListener {
            showNextLocation()
        }
    }

    private fun showNextLocation() {
        val locationTextView = findViewById<TextView>(R.id.location_text)

        if (currentLocationIndex < locations.size) {
            locationTextView.text = "Next location: ${locations[currentLocationIndex]}"
            currentLocationIndex++
        } else {
            locationTextView.text = "Congratulations! You have completed the game!"
            findViewById<Button>(R.id.next_button).isEnabled = false
        }
    }
}
