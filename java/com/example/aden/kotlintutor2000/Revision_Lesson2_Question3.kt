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
import kotlinx.android.synthetic.main.fragment_revision2_question.*

class Revision_Lesson2_Question3 : Fragment() {
    lateinit var sharedPreferences: SharedPreferences
    private var myPreferences = "myPrefs"
    private var L2Q3 = "Lesson2 Question3"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_revision2_question, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val title = "Strings"
        val text = "Which of the following cannot create String?"
        tv_revision2.text = text
        tv_revision2_title.text = title
        lesson2_button1.text = "double quotes"
        lesson2_button2.text = "triple quotes"
        lesson2_button3.text = "no quote"
        lesson2_button4.text = "string interpolation"

        sharedPreferences = this.activity!!.getSharedPreferences(myPreferences, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        val btn1 = getView()?.findViewById<Button>(R.id.lesson2_button1)
        btn1?.setOnClickListener {
            tv_revision2_result.text = "Incorrect"
            tv_revision2_result.setTextColor(Color.parseColor("#DB4437"))
        }

        val btn2 = getView()?.findViewById<Button>(R.id.lesson2_button2)
        btn2?.setOnClickListener {
            tv_revision2_result.text = "Incorrect"
            tv_revision2_result.setTextColor(Color.parseColor("#DB4437"))
        }

        val btn3 = getView()?.findViewById<Button>(R.id.lesson2_button3)
        btn3?.setOnClickListener {
            tv_revision2_result.text = "Correct"
            tv_revision2_result.setTextColor(Color.parseColor("#0F9D58"))
            editor.putBoolean(L2Q3, true)
            editor.apply()
        }

        val btn4 = getView()?.findViewById<Button>(R.id.lesson2_button4)
        btn4?.setOnClickListener {
            tv_revision2_result.text = "Incorrect"
            tv_revision2_result.setTextColor(Color.parseColor("#DB4437"))
        }
    }

}
