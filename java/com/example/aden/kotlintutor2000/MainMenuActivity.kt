package com.example.aden.kotlintutor2000

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.widget.CardView
import android.widget.Button
import android.widget.ImageButton

class MainMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        var mSlideViewPager = findViewById<ViewPager>(R.id.viewPagerMainMenu)
        var mDotLayout = findViewById<TabLayout>(R.id.tabDotsMainMenu)
        mDotLayout.setupWithViewPager(mSlideViewPager, true)
        var sliderAdapter = SlideAdapterMainMenu(this)

        mSlideViewPager.setAdapter(sliderAdapter)

        val gettingStartedCard = findViewById<CardView>(R.id.card_view_module1)
        gettingStartedCard.setOnClickListener {
            val myIntent = Intent(this, Lesson1Introduction::class.java)
            startActivity(myIntent)
        }

        val variablesCard = findViewById<CardView>(R.id.card_view_module2)
        variablesCard.setOnClickListener {
            val myIntent = Intent(this, Lesson2Introduction::class.java)
            startActivity(myIntent)
        }

        val controlFlowCard = findViewById<CardView>(R.id.card_view_module3)
        controlFlowCard.setOnClickListener {
            val myIntent = Intent(this, Lesson3Introduction::class.java)
            startActivity(myIntent)
        }

        val functionsCard = findViewById<CardView>(R.id.card_view_module4)
        functionsCard.setOnClickListener {
            val myIntent = Intent(this, Lesson4Introduction::class.java)
            startActivity(myIntent)
        }

        val classesCard = findViewById<CardView>(R.id.card_view_module5)
        classesCard.setOnClickListener {
            val myIntent = Intent(this, Lesson5Introduction::class.java)
            startActivity(myIntent)
        }

        val btnGame = findViewById<ImageButton>(R.id.btn_mainmenu_game)
        btnGame.setOnClickListener {
            val myIntent = Intent(this, GameActivity::class.java)
            startActivity(myIntent)
        }

        val btnDonation = findViewById<ImageButton>(R.id.btn_mainmenu_donate)
        btnDonation.setOnClickListener {
            val myIntent = Intent(this, Donation::class.java)
            myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(myIntent)
            overridePendingTransition(0,0)
        }
    }
}
