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
import kotlinx.android.synthetic.main.fragment_revision1_question.*

class Revision_Lesson1_Question2 : Fragment() {
    lateinit var sharedPreferences: SharedPreferences
    private var myPreferences = "myPrefs"
    private var L1Q2 = "Lesson1 Question2"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_revision1_question, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val title = "What is Kotlin"
        val text = "When was Kotlin released?"
        tv_revision1.text = text
        tv_revision1_title.text = title
        lesson1_button1.text = "1999"
        lesson1_button2.text = "2004"
        lesson1_button3.text = "2010"
        lesson1_button4.text = "2016"

        sharedPreferences = this.activity!!.getSharedPreferences(myPreferences, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        val btn1 = getView()?.findViewById<Button>(R.id.lesson1_button1)
        btn1?.setOnClickListener {
            tv_revision1_result.text = "Incorrect"
            tv_revision1_result.setTextColor(Color.parseColor("#DB4437"))
        }

        val btn2 = getView()?.findViewById<Button>(R.id.lesson1_button2)
        btn2?.setOnClickListener {
            tv_revision1_result.text = "Incorrect"
            tv_revision1_result.setTextColor(Color.parseColor("#DB4437"))
        }

        val btn3 = getView()?.findViewById<Button>(R.id.lesson1_button3)
        btn3?.setOnClickListener {
            tv_revision1_result.text = "Incorrect"
            tv_revision1_result.setTextColor(Color.parseColor("#DB4437"))
        }

        val btn4 = getView()?.findViewById<Button>(R.id.lesson1_button4)
        btn4?.setOnClickListener {
            tv_revision1_result.text = "Correct"
            tv_revision1_result.setTextColor(Color.parseColor("#0F9D58"))
            editor.putBoolean(L1Q2, true)
            editor.apply()
        }
    }

}
