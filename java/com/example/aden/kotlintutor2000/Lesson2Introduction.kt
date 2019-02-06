package com.example.aden.kotlintutor2000

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_lesson2_introduction.*

class Lesson2Introduction : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    private var myPreferences = "myPrefs"
    private var L2C1 = "Lesson2 Content1"
    private var L2C2 = "Lesson2 Content2"
    private var L2C3 = "Lesson2 Content3"
    private var L2C4 = "Lesson2 Content4"
    private var L2C5 = "Lesson2 Content5"
    private var L2C6 = "Lesson2 Content6"
    private var L2C7 = "Lesson2 Content7"
    private var L2C8 = "Lesson2 Content8"
    private var L2Q1 = "Lesson2 Question1"
    private var L2Q2 = "Lesson2 Question2"
    private var L2Q3 = "Lesson2 Question3"
    private var L2Q4 = "Lesson2 Question4"
    private var EMPTY = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson2_introduction)
        val details = "<b>" + "What Will I Learn?" + "</b><br>" +
                "- Declaring Variables<br>" +
                "- Basic Variable Types<br>" +
                "- Numbers<br>" +
                "- Arithmetic Operators<br>" +
                "- Boolean<br>" +
                "- Strings<br>" +
                "- Arrays<br>" +
                "- Comments<br><br>" +
                "<b>" + "Prerequisites" + "</b><br>" +
                "- Have a basic understanding of programming<br>" +
                "- Have some knowledge of Java<br><br>"

        this.tv_Descriptiondetails.text = Html.fromHtml(details)

        val btn_Startnow = findViewById<Button>(R.id.btn_Startnow)
        btn_Startnow.setOnClickListener {
            val myIntent = Intent(this, Lesson2Content::class.java)
            startActivity(myIntent)
        }

        sharedPreferences = getSharedPreferences(myPreferences, Context.MODE_PRIVATE)
    }

    override fun onResume() {
        super.onResume()

        val l2c1 = sharedPreferences.getBoolean(L2C1, EMPTY)
        val l2c2 = sharedPreferences.getBoolean(L2C2, EMPTY)
        val l2c3 = sharedPreferences.getBoolean(L2C3, EMPTY)
        val l2c4 = sharedPreferences.getBoolean(L2C4, EMPTY)
        val l2c5 = sharedPreferences.getBoolean(L2C5, EMPTY)
        val l2c6 = sharedPreferences.getBoolean(L2C6, EMPTY)
        val l2c7 = sharedPreferences.getBoolean(L2C7, EMPTY)
        val l2c8 = sharedPreferences.getBoolean(L2C8, EMPTY)
        val l2q1 = sharedPreferences.getBoolean(L2Q1, EMPTY)
        val l2q2 = sharedPreferences.getBoolean(L2Q2, EMPTY)
        val l2q3 = sharedPreferences.getBoolean(L2Q3, EMPTY)
        val l2q4 = sharedPreferences.getBoolean(L2Q4, EMPTY)

        var questionList = arrayListOf<Boolean>()
        questionList.add(l2c1)
        questionList.add(l2c2)
        questionList.add(l2c3)
        questionList.add(l2c4)
        questionList.add(l2c5)
        questionList.add(l2c6)
        questionList.add(l2c7)
        questionList.add(l2c8)
        questionList.add(l2q1)
        questionList.add(l2q2)
        questionList.add(l2q3)
        questionList.add(l2q4)

        var sum = 0
        for (q: Boolean in questionList) {
            if (q == true) {
                sum++
            }
        }

        var completion = 0
        when (sum) {
            0 -> {completion = 0}
            1 -> {completion = 8}
            2 -> {completion = 17}
            3 -> {completion = 25}
            4 -> {completion = 33}
            5 -> {completion = 42}
            6 -> {completion = 50}
            7 -> {completion = 58}
            8 -> {completion = 67}
            9 -> {completion = 75}
            10 -> {completion = 83}
            11 -> {completion = 92}
            12 -> {completion = 100}
        }

        pb_completion.setProgress(completion)
        tv_completion.text = completion.toString() + "%"
    }
}
