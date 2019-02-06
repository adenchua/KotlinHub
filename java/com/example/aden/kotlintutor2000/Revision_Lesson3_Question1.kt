package com.example.aden.kotlintutor2000

import android.content.Context
import android.content.SharedPreferences
import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.fragment_revision2_question.*
import kotlinx.android.synthetic.main.fragment_revision3_question.*

class Revision_Lesson3_Question1 : Fragment() {
    lateinit var sharedPreferences: SharedPreferences
    private var myPreferences = "myPrefs"
    private var L3Q1 = "Lesson3 Question1"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_revision3_question, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val title = "When Expression"
        val text = "What is printed if x is 5?"
        tv_revision3.text = text
        tv_revision3_title.text = title
        lesson3_button1.text = "x == 1"
        lesson3_button2.text = "x == 2"
        lesson3_button3.text = "x == 5"
        lesson3_button4.text = "x is neither 1 nor 2"

        sharedPreferences = this.activity!!.getSharedPreferences(myPreferences, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        var image = getView()?.findViewById<ImageView>(R.id.iv_revision3)
        image?.setImageResource(R.drawable.code_when1)
        image?.layoutParams?.height ?:120

        val btn1 = getView()?.findViewById<Button>(R.id.lesson3_button1)
        btn1?.setOnClickListener {
            tv_revision3_result.text = "Incorrect"
            tv_revision3_result.setTextColor(Color.parseColor("#DB4437"))
        }

        val btn2 = getView()?.findViewById<Button>(R.id.lesson3_button2)
        btn2?.setOnClickListener {
            tv_revision3_result.text = "Incorrect"
            tv_revision3_result.setTextColor(Color.parseColor("#DB4437"))
        }

        val btn3 = getView()?.findViewById<Button>(R.id.lesson3_button3)
        btn3?.setOnClickListener {
            tv_revision3_result.text = "Incorrect"
            tv_revision3_result.setTextColor(Color.parseColor("#DB4437"))
        }

        val btn4 = getView()?.findViewById<Button>(R.id.lesson3_button4)
        btn4?.setOnClickListener {
            tv_revision3_result.text = "Correct"
            tv_revision3_result.setTextColor(Color.parseColor("#0F9D58"))
            editor.putBoolean(L3Q1, true)
            editor.apply()
        }
    }

}
