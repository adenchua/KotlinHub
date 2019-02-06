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
import kotlinx.android.synthetic.main.fragment_revision3_question.*

class Revision_Lesson3_Question4 : Fragment() {
    lateinit var sharedPreferences: SharedPreferences
    private var myPreferences = "myPrefs"
    private var L3Q4 = "Lesson3 Question4"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_revision3_question, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val title = "While Loop"
        val text = "Is there any difference of while loop in Kotlin compared to in Java?"
        tv_revision3.text = text
        tv_revision3_title.text = title
        lesson3_button1.text = "Yes"
        lesson3_button2.text = "No"
        lesson3_button3.text = ""
        lesson3_button4.text = ""

        sharedPreferences = this.activity!!.getSharedPreferences(myPreferences, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        val btn1 = getView()?.findViewById<Button>(R.id.lesson3_button1)
        btn1?.setOnClickListener {
            tv_revision3_result.text = "Incorrect"
            tv_revision3_result.setTextColor(Color.parseColor("#DB4437"))
        }

        val btn2 = getView()?.findViewById<Button>(R.id.lesson3_button2)
        btn2?.setOnClickListener {
            tv_revision3_result.text = "Correct"
            tv_revision3_result.setTextColor(Color.parseColor("#0F9D58"))
            editor.putBoolean(L3Q4, true)
            editor.apply()
        }

        val btn3 = getView()?.findViewById<Button>(R.id.lesson3_button3)
        btn3?.isClickable = false
        btn3?.visibility = View.INVISIBLE

        val btn4 = getView()?.findViewById<Button>(R.id.lesson3_button4)
        btn4?.isClickable = false
        btn4?.visibility = View.INVISIBLE
    }

}
