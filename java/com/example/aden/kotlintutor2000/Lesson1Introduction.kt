package com.example.aden.kotlintutor2000

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_lesson1_introduction.*

class Lesson1Introduction : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    private var myPreferences = "myPrefs"
    private var L1C1 = "Lesson1 Content1"
    private var L1C2 = "Lesson1 Content2"
    private var L1Q1 = "Lesson1 Question1"
    private var L1Q2 = "Lesson1 Question2"
    private var L1Q3 = "Lesson1 Question3"
    private var L1Q4 = "Lesson1 Question4"
    private var EMPTY = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson1_introduction)
        val details = "<b>" + "What Will I Learn?" + "</b><br>" +
                "- What is Kotlin.<br>" +
                "- Kotlin History.<br>" +
                "- The relation between Kotlin and Java.<br>" +
                "- Benefits of using Kotlin.<br><br>" +
                "<b>" + "Who is the target audience?" + "</b><br>" +
                "- Those who want to understand android programming language.<br>" +
                "- Those who want to understand Kotlin better.<br>" +
                "- Those who want to start a career in Computer programming.<br><br>" +
                "<b>" + "Benefits" + "</b><br>" +
                "- Get a clear understanding of what Kotlin is.<br>" +
                "- Get familiar with programming language.<br>" +
                "- Become a better you.<br><br>" +
                "<b>" + "Requirements" + "</b><br>" +
                "- Knowledge of English language.<br>" +
                "- Having a hand to navigate the phone.<br><br>" +
                "<b>" + "Salary" + "</b><br>" +
                "- 90,000 USD per month.<br>"

        this.tv_Descriptiondetails.text = Html.fromHtml(details)

        val btn_Startnow = findViewById<Button>(R.id.btn_Startnow)
        btn_Startnow.setOnClickListener {
            val myIntent = Intent(this, Lesson1Content::class.java)
            startActivity(myIntent)
        }

        sharedPreferences = getSharedPreferences(myPreferences, Context.MODE_PRIVATE)
//        val editor = sharedPreferences.edit()
//        editor.putBoolean(L1C1, EMPTY)
//        editor.putBoolean(L1C2, EMPTY)
//        editor.putBoolean(L1Q1, EMPTY)
//        editor.putBoolean(L1Q2, EMPTY)
//        editor.putBoolean(L1Q3, EMPTY)
//        editor.putBoolean(L1Q4, EMPTY)
//        editor.apply()
    }

    override fun onResume() {
        super.onResume()

        val l1c1 = sharedPreferences.getBoolean(L1C1, EMPTY)
        val l1c2 = sharedPreferences.getBoolean(L1C2, EMPTY)
        val l1q1 = sharedPreferences.getBoolean(L1Q1, EMPTY)
        val l1q2 = sharedPreferences.getBoolean(L1Q2, EMPTY)
        val l1q3 = sharedPreferences.getBoolean(L1Q3, EMPTY)
        val l1q4 = sharedPreferences.getBoolean(L1Q4, EMPTY)

        var questionList = arrayListOf<Boolean>()
        questionList.add(l1c1)
        questionList.add(l1c2)
        questionList.add(l1q1)
        questionList.add(l1q2)
        questionList.add(l1q3)
        questionList.add(l1q4)

        var sum = 0
        for (q: Boolean in questionList) {
            if (q == true) {
                sum++
            }
        }

        var completion = 0
        when (sum) {
            0 -> {completion = 0}
            1 -> {completion = 17}
            2 -> {completion = 33}
            3 -> {completion = 50}
            4 -> {completion = 67}
            5 -> {completion = 88}
            6 -> {completion = 100}
        }

        pb_completion.setProgress(completion)
        tv_completion.text = completion.toString() + "%"
    }
}
