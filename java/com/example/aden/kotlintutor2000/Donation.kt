package com.example.aden.kotlintutor2000

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Donation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donation)

        val btnGame = findViewById<ImageButton>(R.id.btn_donation_game)
        btnGame.setOnClickListener {
            val myIntent = Intent(this, GameActivity::class.java)
            startActivity(myIntent)
        }

        val btnHome = findViewById<ImageButton>(R.id.btn_donation_home)
        btnHome.setOnClickListener {
            val myIntent = Intent(this, MainMenuActivity::class.java)
            myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(myIntent)
            overridePendingTransition(0,0)
        }

        val btnPaypal = findViewById<Button>(R.id.btn_donation_paypal)
        btnPaypal.setOnClickListener {
            val myIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paypal.me/AdenChua"))
            startActivity(myIntent)
        }
    }
}
