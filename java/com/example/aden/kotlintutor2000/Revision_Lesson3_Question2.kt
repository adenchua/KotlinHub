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
import kotlinx.android.synthetic.main.fragment_revision3_question.*

class Revision_Lesson3_Question2 : Fragment() {
    lateinit var sharedPreferences: SharedPreferences
    private var myPreferences = "myPrefs"
    private var L3Q2 = "Lesson3 Question2"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_revision3_question, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val title = "For Loop"
        val text = "What will be printed?"
        tv_revision3.text = text
        tv_revision3_title.text = title
        lesson3_button1.text = "0246123"
        lesson3_button2.text = "147642"
        lesson3_button3.text = "1236420"
        lesson3_button4.text = "1116543210"

        sharedPreferences = this.activity!!.getSharedPreferences(myPreferences, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        var image = getView()?.findViewById<ImageView>(R.id.iv_revision3)
        image?.setImageResource(R.drawable.code_for_loop_3)
        image?.layoutParams?.height ?:65

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
            tv_revision3_result.text = "Correct"
            tv_revision3_result.setTextColor(Color.parseColor("#0F9D58"))
            editor.putBoolean(L3Q2, true)
            editor.apply()
        }

        val btn4 = getView()?.findViewById<Button>(R.id.lesson3_button4)
        btn4?.setOnClickListener {
            tv_revision3_result.text = "Incorrect"
            tv_revision3_result.setTextColor(Color.parseColor("#DB4437"))
        }
    }

}
