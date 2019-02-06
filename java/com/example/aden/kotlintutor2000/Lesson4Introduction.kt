package com.example.aden.kotlintutor2000

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_lesson4_introduction.*

class Lesson4Introduction : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    private var myPreferences = "myPrefs"
    private var L4C1 = "Lesson4 Content1"
    private var L4C2 = "Lesson4 Content2"
    private var L4C3 = "Lesson4 Content3"
    private var L4C4 = "Lesson4 Content4"
    private var L4C5 = "Lesson4 Content5"
    private var L4C6 = "Lesson4 Content6"
    private var L4C7 = "Lesson4 Content7"
    private var L4Q1 = "Lesson4 Question1"
    private var L4Q2 = "Lesson4 Question2"
    private var L4Q3 = "Lesson4 Question3"
    private var L4Q4 = "Lesson4 Question4"
    private var EMPTY = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson4_introduction)
        val details = "<b>" + "What Will I Learn?" + "</b><br>" +
                "- Kotlin Functions<br>" +
                "- Types of Functions<br>" +
                "- Kotlin Standard Library Function<br>" +
                "- User-defined Functions<br>" +
                "- How to call a function<br>" +
                "- How functions work<br>" +
                "- Lambda Expressions<br><br>" +
                "<b>" + "Prerequisites" + "</b><br>" +
                "- Have a basic understanding of programming<br>" +
                "- Have some knowledge of Java<br><br>"

        this.tv_Descriptiondetails.text = Html.fromHtml(details)

        val btn_Startnow = findViewById<Button>(R.id.btn_Startnow)
        btn_Startnow.setOnClickListener {
            val myIntent = Intent(this, Lesson4Content::class.java)
            startActivity(myIntent)
        }

        sharedPreferences = getSharedPreferences(myPreferences, Context.MODE_PRIVATE)
    }

    override fun onResume() {
        super.onResume()

        val l4c1 = sharedPreferences.getBoolean(L4C1, EMPTY)
        val l4c2 = sharedPreferences.getBoolean(L4C2, EMPTY)
        val l4c3 = sharedPreferences.getBoolean(L4C3, EMPTY)
        val l4c4 = sharedPreferences.getBoolean(L4C4, EMPTY)
        val l4c5 = sharedPreferences.getBoolean(L4C5, EMPTY)
        val l4c6 = sharedPreferences.getBoolean(L4C6, EMPTY)
        val l4c7 = sharedPreferences.getBoolean(L4C7, EMPTY)
        val l4q1 = sharedPreferences.getBoolean(L4Q1, EMPTY)
        val l4q2 = sharedPreferences.getBoolean(L4Q2, EMPTY)
        val l4q3 = sharedPreferences.getBoolean(L4Q3, EMPTY)
        val l4q4 = sharedPreferences.getBoolean(L4Q4, EMPTY)

        var questionList = arrayListOf<Boolean>()
        questionList.add(l4c1)
        questionList.add(l4c2)
        questionList.add(l4c3)
        questionList.add(l4c4)
        questionList.add(l4c5)
        questionList.add(l4c6)
        questionList.add(l4c7)
        questionList.add(l4q1)
        questionList.add(l4q2)
        questionList.add(l4q3)
        questionList.add(l4q4)

        var sum = 0
        for (q: Boolean in questionList) {
            if (q == true) {
                sum++
            }
        }

        var completion = 0
        when (sum) {
            0 -> {completion = 0}
            1 -> {completion = 9}
            2 -> {completion = 18}
            3 -> {completion = 27}
            4 -> {completion = 36}
            5 -> {completion = 45}
            6 -> {completion = 55}
            7 -> {completion = 64}
            8 -> {completion = 73}
            9 -> {completion = 82}
            10 -> {completion = 91}
            11 -> {completion = 100}
        }

        pb_completion.setProgress(completion)
        tv_completion.text = completion.toString() + "%"
    }
}