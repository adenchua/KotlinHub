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
import kotlinx.android.synthetic.main.fragment_revision5_question.*

class Revision_Lesson5_Question4 : Fragment() {
    lateinit var sharedPreferences: SharedPreferences
    private var myPreferences = "myPrefs"
    private var L5Q4 = "Lesson5 Question4"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_revision5_question, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val title = "Object-oriented Programming"
        val text = "The two characteristics of objects are ..."
        tv_revision5.text = text
        tv_revision5_title.text = title
        lesson5_button1.text = "State and Behavior"
        lesson5_button2.text = "Form and Behavior"
        lesson5_button3.text = "State and Character"
        lesson5_button4.text = "Form and Character"

        sharedPreferences = this.activity!!.getSharedPreferences(myPreferences, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        val btn1 = getView()?.findViewById<Button>(R.id.lesson5_button1)
        btn1?.setOnClickListener {
            tv_revision5_result.text = "Correct"
            tv_revision5_result.setTextColor(Color.parseColor("#0F9D58"))
        }

        val btn2 = getView()?.findViewById<Button>(R.id.lesson5_button2)
        btn2?.setOnClickListener {
            tv_revision5_result.text = "Incorrect"
            tv_revision5_result.setTextColor(Color.parseColor("#DB4437"))
        }

        val btn3 = getView()?.findViewById<Button>(R.id.lesson5_button3)
        btn3?.setOnClickListener {
            tv_revision5_result.text = "Incorrect"
            tv_revision5_result.setTextColor(Color.parseColor("#DB4437"))
        }

        val btn4 = getView()?.findViewById<Button>(R.id.lesson5_button4)
        btn4?.setOnClickListener {
            tv_revision5_result.text = "Incorrect"
            tv_revision5_result.setTextColor(Color.parseColor("#DB4437"))
            editor.putBoolean(L5Q4, true)
            editor.apply()
        }
    }

}
