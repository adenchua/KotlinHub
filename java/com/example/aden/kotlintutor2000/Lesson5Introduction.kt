package com.example.aden.kotlintutor2000

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_lesson5_introduction.*

class Lesson5Introduction : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    private var myPreferences = "myPrefs"
    private var L5C1 = "Lesson5 Content1"
    private var L5C2 = "Lesson5 Content2"
    private var L5C3 = "Lesson5 Content3"
    private var L5C4 = "Lesson5 Content4"
    private var L5Q1 = "Lesson5 Question1"
    private var L5Q2 = "Lesson5 Question2"
    private var L5Q3 = "Lesson5 Question3"
    private var L5Q4 = "Lesson5 Question4"
    private var EMPTY = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson5_introduction)
        val details = "<b>" + "What Will I Learn?" + "</b><br>" +
                "- Kotlin Class and Objects<br>" +
                "- Object-oriented Programming (OOP)<br>" +
                "- Kotlin Class<br>" +
                "- Kotlin Objects<br><br>" +
                "<b>" + "Prerequisites" + "</b><br>" +
                "- Have a basic understanding of programming<br>" +
                "- Have some knowledge of Java<br><br>"

        this.tv_Descriptiondetails.text = Html.fromHtml(details)

        val btn_Startnow = findViewById<Button>(R.id.btn_Startnow)
        btn_Startnow.setOnClickListener {
            val myIntent = Intent(this, Lesson5Content::class.java)
            startActivity(myIntent)
        }

        sharedPreferences = getSharedPreferences(myPreferences, Context.MODE_PRIVATE)
    }

    override fun onResume() {
        super.onResume()

        val l5c1 = sharedPreferences.getBoolean(L5C1, EMPTY)
        val l5c2 = sharedPreferences.getBoolean(L5C2, EMPTY)
        val l5c3 = sharedPreferences.getBoolean(L5C3, EMPTY)
        val l5c4 = sharedPreferences.getBoolean(L5C4, EMPTY)
        val l5q1 = sharedPreferences.getBoolean(L5Q1, EMPTY)
        val l5q2 = sharedPreferences.getBoolean(L5Q2, EMPTY)
        val l5q3 = sharedPreferences.getBoolean(L5Q3, EMPTY)
        val l5q4 = sharedPreferences.getBoolean(L5Q4, EMPTY)

        var questionList = arrayListOf<Boolean>()
        questionList.add(l5c1)
        questionList.add(l5c2)
        questionList.add(l5c3)
        questionList.add(l5c4)
        questionList.add(l5q1)
        questionList.add(l5q2)
        questionList.add(l5q3)
        questionList.add(l5q4)

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