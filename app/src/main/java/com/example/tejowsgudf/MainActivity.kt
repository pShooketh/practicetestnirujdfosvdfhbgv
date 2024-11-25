package com.example.tejowsgudf

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageButton
import com.example.tejowsgudf.model.profile

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Taskbar Buttons
        val homeButton: ImageButton = findViewById(R.id.homeButton)
        val transactionsButton: ImageButton = findViewById(R.id.transactionsButton)
        val profileButton: ImageButton = findViewById(R.id.profileButton)

        // Handle Home Button (Stay on the same activity)
        homeButton.setOnClickListener {
            // Do nothing, as this is the Home screen
        }

        // Handle Transactions Button (Navigate to TransactionsActivity)
        transactionsButton.setOnClickListener {
            val intent = Intent(this@MainActivity, transaction::class.java)
            startActivity(intent)
        }

        // Handle Profile Button (Navigate to ProfileActivity)
        profileButton.setOnClickListener {
            val intent = Intent(this@MainActivity, profile::class.java)
            startActivity(intent)


        }
    }
}
