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
import kotlinx.android.synthetic.main.fragment_revision4_question.*

class Revision_Lesson4_Question3 : Fragment() {
    lateinit var sharedPreferences: SharedPreferences
    private var myPreferences = "myPrefs"
    private var L4Q3 = "Lesson4 Question3"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_revision4_question, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val title = "How to call a function"
        val text = "Which of the following calls a function?"
        tv_revision4.text = text
        tv_revision4_title.text = title
        lesson4_button1.text = "()callAFunction"
        lesson4_button2.text = "callAFunction{}"
        lesson4_button3.text = "callAFunction"
        lesson4_button4.text = "callAFunction()"

        sharedPreferences = this.activity!!.getSharedPreferences(myPreferences, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        val btn1 = getView()?.findViewById<Button>(R.id.lesson4_button1)
        btn1?.setOnClickListener {
            tv_revision4_result.text = "Incorrect"
            tv_revision4_result.setTextColor(Color.parseColor("#DB4437"))
        }

        val btn2 = getView()?.findViewById<Button>(R.id.lesson4_button2)
        btn2?.setOnClickListener {
            tv_revision4_result.text = "Incorrect"
            tv_revision4_result.setTextColor(Color.parseColor("#DB4437"))
        }

        val btn3 = getView()?.findViewById<Button>(R.id.lesson4_button3)
        btn3?.setOnClickListener {
            tv_revision4_result.text = "Incorrect"
            tv_revision4_result.setTextColor(Color.parseColor("#DB4437"))
        }

        val btn4 = getView()?.findViewById<Button>(R.id.lesson4_button4)
        btn4?.setOnClickListener {
            tv_revision4_result.text = "Correct"
            tv_revision4_result.setTextColor(Color.parseColor("#0F9D58"))
            editor.putBoolean(L4Q3, true)
            editor.apply()
        }
    }

}
