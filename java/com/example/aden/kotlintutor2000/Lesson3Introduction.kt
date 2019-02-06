package com.example.aden.kotlintutor2000

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_lesson3_introduction.*

class Lesson3Introduction : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    private var myPreferences = "myPrefs"
    private var L3C1 = "Lesson3 Content1"
    private var L3C2 = "Lesson3 Content2"
    private var L3C3 = "Lesson3 Content3"
    private var L3C4 = "Lesson3 Content4"
    private var L3Q1 = "Lesson3 Question1"
    private var L3Q2 = "Lesson3 Question2"
    private var L3Q3 = "Lesson3 Question3"
    private var L3Q4 = "Lesson3 Question4"
    private var EMPTY = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson3_introduction)
        val details = "<b>" + "What Will I Learn?" + "</b><br>" +
                "- If Expression<br>" +
                "- When Expression<br>" +
                "- For Loops<br>" +
                "- While Loops<br><br>" +
                "<b>" + "Prerequisites" + "</b><br>" +
                "- Have a basic understanding of programming<br>" +
                "- Have some knowledge of Java<br><br>"

        this.tv_Descriptiondetails.text = Html.fromHtml(details)

        val btn_Startnow = findViewById<Button>(R.id.btn_Startnow)
        btn_Startnow.setOnClickListener {
            val myIntent = Intent(this, Lesson3Content::class.java)
            startActivity(myIntent)
        }

        sharedPreferences = getSharedPreferences(myPreferences, Context.MODE_PRIVATE)
    }

    override fun onResume() {
        super.onResume()

        val l3c1 = sharedPreferences.getBoolean(L3C1, EMPTY)
        val l3c2 = sharedPreferences.getBoolean(L3C2, EMPTY)
        val l3c3 = sharedPreferences.getBoolean(L3C3, EMPTY)
        val l3c4 = sharedPreferences.getBoolean(L3C4, EMPTY)
        val l3q1 = sharedPreferences.getBoolean(L3Q1, EMPTY)
        val l3q2 = sharedPreferences.getBoolean(L3Q2, EMPTY)
        val l3q3 = sharedPreferences.getBoolean(L3Q3, EMPTY)
        val l3q4 = sharedPreferences.getBoolean(L3Q4, EMPTY)

        var questionList = arrayListOf<Boolean>()
        questionList.add(l3c1)
        questionList.add(l3c2)
        questionList.add(l3c3)
        questionList.add(l3c4)
        questionList.add(l3q1)
        questionList.add(l3q2)
        questionList.add(l3q3)
        questionList.add(l3q4)

        var sum = 0
        for (q: Boolean in questionList) {
            if (q == true) {
                sum++
            }
        }

        var completion = 0
        when (sum) {
            0 -> {completion = 0}
            1 -> {completion = 13}
            2 -> {completion = 25}
            3 -> {completion = 38}
            4 -> {completion = 50}
            5 -> {completion = 63}
            6 -> {completion = 75}
            7 -> {completion = 88}
            8 -> {completion = 100}
        }

        pb_completion.setProgress(completion)
        tv_completion.text = completion.toString() + "%"
    }
}