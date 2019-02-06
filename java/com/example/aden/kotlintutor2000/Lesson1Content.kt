package com.example.aden.kotlintutor2000

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_lesson1_content.*

class Lesson1Content : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences
    private var myPreferences = "myPrefs"
    private var L1C1 = "Lesson1 Content1"
    private var L1C2 = "Lesson1 Content2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson1_content)

        sharedPreferences = getSharedPreferences(myPreferences, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        val btn_Letsreview = findViewById<Button>(R.id.btn_letsreview_introductiontokotlin)
        btn_Letsreview.setOnClickListener {
            val myIntent = Intent(this, Revision::class.java)
            startActivity(myIntent)
        }

        val btn_Backtohome = findViewById<Button>(R.id.btn_Backtohome)
        btn_Backtohome.setOnClickListener {
            val myIntent = Intent(this, MainMenuActivity::class.java)
            startActivity(myIntent)
        }

        val cardExpand = findViewById<CardView>(R.id.cv_Whatiskotlin)
        val propLayout = findViewById<LinearLayout>(R.id.card_expanded_Whatiskotlin)
        val cardExpand2 = findViewById<CardView>(R.id.cv_Whykotlin)
        val propLayout2 = findViewById<LinearLayout>(R.id.card_expanded_Whykotlin)

        cardExpand.setOnClickListener {
            onPlay(propLayout)
            editor.putBoolean(L1C1, true)
            editor.apply()
        }

        cardExpand2.setOnClickListener {
            onPlay(propLayout2)
            editor.putBoolean(L1C2, true)
            editor.apply()
        }

        val whatiskotlin = "Kotlin is a general purpose, free, open source, statically typed “pragmatic” programming language for the JVM and Android that combines object-oriented and functional programming features. It is focused on interoperability, safety, clarity, and tooling support.\n\n" +
                "Kotlin 1.0 was released in February 2016, and since that time it’s been embraced by developers around the world, especially those within the Android community. Google announced that Kotlin was officially supported for Android in May 2017.\n\n" +
                "Even though Kotlin is a full-fledged functional programming language, it preserves most of the object-oriented nature of Java as an alternative programming style, which is very handy when converting existing Java code. If you already know Java, learning Kotlin is easy!"

        tv_Whatiskotlin_content.text = whatiskotlin

        val whykotlin = "Statically Typed, object-oriented, modern programming language\n\n" +
                "Properties and extension for classes\n\n" +
                "Created by developers for developers\n\n" +
                "Concise, much less boilerplate code than some other languages\n\n" +
                "Increased null safety with nullable and non-nullable data types\n\n" +
                "Open sourced, free\n\n" +
                "Supports lambdas and higher-order functions\n\n" +
                "Fully compatible with Java language, so anyone can migrate over time and continue using their favourite libraries\n\n" +
                "Officially supported for android development, and included with IntelliJ and Android Studio"

        tv_Whykotlin_content.text =whykotlin
    }

    fun onPlay(propLayout: LinearLayout) {
        if (propLayout.visibility == View.VISIBLE) {
            propLayout.visibility = View.GONE
        }
        else {
            propLayout.visibility = View.VISIBLE
        }
    }
}
