package com.example.aden.kotlintutor2000

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.text.Html
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mSlideViewPager = findViewById<ViewPager>(R.id.viewPager)
        var mDotLayout = findViewById<TabLayout>(R.id.tabDots)
        mDotLayout.setupWithViewPager(mSlideViewPager, true)
        var sliderAdapter = SliderAdapter(this)

        mSlideViewPager.setAdapter(sliderAdapter)

        val btn_get_started = findViewById<Button>(R.id.btn_get_started)
        btn_get_started.setOnClickListener {
            val myIntent = Intent(this, MainMenuActivity::class.java)
            startActivity(myIntent)
        }

    }

}
