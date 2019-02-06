package com.example.aden.kotlintutor2000

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_lesson3_content.*

class Lesson3Content : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    private var myPreferences = "myPrefs"
    private var L3C1 = "Lesson3 Content1"
    private var L3C2 = "Lesson3 Content2"
    private var L3C3 = "Lesson3 Content3"
    private var L3C4 = "Lesson3 Content4"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson3_content)

        sharedPreferences = getSharedPreferences(myPreferences, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        val btn_Letsreview = findViewById<Button>(R.id.btn_letsreview_introductiontokotlin)
        btn_Letsreview.setOnClickListener {
            val myIntent = Intent(this, Revision3::class.java)
            startActivity(myIntent)
        }

        val btn_Backtohome = findViewById<Button>(R.id.btn_Backtohome)
        btn_Backtohome.setOnClickListener {
            val myIntent = Intent(this, MainMenuActivity::class.java)
            startActivity(myIntent)
        }

        val cardExpand = findViewById<CardView>(R.id.cv_if_expression)
        val propLayout = findViewById<LinearLayout>(R.id.card_expanded_if_expression)
        val cardExpand2 = findViewById<CardView>(R.id.cv_when_expression)
        val propLayout2 = findViewById<LinearLayout>(R.id.card_expanded_when_expression)
        val cardExpand3 = findViewById<CardView>(R.id.cv_for_loop)
        val propLayout3 = findViewById<LinearLayout>(R.id.card_expanded_for_loop)
        val cardExpand4 = findViewById<CardView>(R.id.cv_while_loop)
        val propLayout4 = findViewById<LinearLayout>(R.id.card_expanded_while_loop)

        cardExpand.setOnClickListener {
            onPlay(propLayout)
            editor.putBoolean(L3C1, true)
            editor.apply()
        }

        cardExpand2.setOnClickListener {
            onPlay(propLayout2)
            editor.putBoolean(L3C2, true)
            editor.apply()
        }

        cardExpand3.setOnClickListener {
            onPlay(propLayout3)
            editor.putBoolean(L3C3, true)
            editor.apply()
        }

        cardExpand4.setOnClickListener {
            onPlay(propLayout4)
            editor.putBoolean(L3C4, true)
            editor.apply()
        }

        val if_expression_1 = "In Kotlin, if is an expression, i.e. it returns a value. Therefore there is no ternary operator (condition ? then : else), because ordinary if works fine in this role.\n"
        val if_expression_2 = "if branches can be blocks, and the last expression is the value of a block:\n"
        val if_expression_3 = "If you're using if as an expression rather than a statement (for example, returning its value or assigning it to a variable), the expression is required to have an else branch.\n"

        tv_if_expression_1.text = if_expression_1
        tv_if_expression_3.text = if_expression_2
        tv_if_expression_5.text = if_expression_3

        val when_expression_1 = "when replaces the switch operator of C-like languages. In the simplest form it looks like this"
        val when_expression_2 = "when matches its argument against all branches sequentially until some branch condition is satisfied. when can be used either as an expression or as a statement. If it is used as an expression, the value of the satisfied branch becomes the value of the overall expression. If it is used as a statement, the values of individual branches are ignored. (Just like with if, each branch can be a block, and its value is the value of the last expression in the block.)\n" +
                "\n" +
                "The else branch is evaluated if none of the other branch conditions are satisfied. If when is used as an expression, the else branch is mandatory, unless the compiler can prove that all possible cases are covered with branch conditions (as, for example, with enum class entries and sealed class subtypes).\n" +
                "\n" +
                "If many cases should be handled in the same way, the branch conditions may be combined with a comma:"
        val when_expression_3 = "We can use arbitrary expressions (not only constants) as branch conditions"
        val when_expression_4 = "We can also check a value for being in or !in a range or a collection:"
        val when_expression_5 = "Another possibility is to check that a value is or !is of a particular type. Note that, due to smart casts, you can access the methods and properties of the type without any extra checks."
        val when_expression_6 = "when can also be used as a replacement for an if-else if chain. If no argument is supplied, the branch conditions are simply boolean expressions, and a branch is executed when its condition is true:"
        val when_expression_7 = "Since Kotlin 1.3, it is possible to capture when subject in a variable using following syntax:"
        val when_expression_8 = "Scope of variable, introduced in when subject, is restricted to when body."

        tv_when_expression_1.text = when_expression_1
        tv_when_expression_2.text = when_expression_2
        tv_when_expression_3.text = when_expression_3
        tv_when_expression_4.text = when_expression_4
        tv_when_expression_5.text = when_expression_5
        tv_when_expression_6.text = when_expression_6
        tv_when_expression_7.text = when_expression_7
        tv_when_expression_8.text = when_expression_8


        val for_loop_1 = "for loop iterates through anything that provides an iterator. This is equivalent to the foreach loop in languages like C#. The syntax is as follows:"
        val for_loop_2 = "The body can be a block."
        val for_loop_3 = "As mentioned before, for iterates through anything that provides an iterator, i.e.\n" +
                "\n" +
                "has a member- or extension-function iterator(), whose return type\n" +
                "has a member- or extension-function next(), and\n" +
                "has a member- or extension-function hasNext() that returns Boolean.\n" +
                "All of these three functions need to be marked as operator.\n" +
                "\n" +
                "To iterate over a range of numbers, use a range expression:"
        val for_loop_4 = "A for loop over a range or an array is compiled to an index-based loop that does not create an iterator object.\n" +
                "\n" +
                "If you want to iterate through an array or a list with an index, you can do it this way:"
        val for_loop_5 = "Alternatively, you can use the withIndex library function:"

        tv_for_loop_1.text = for_loop_1
        tv_for_loop_2.text = for_loop_2
        tv_for_loop_3.text = for_loop_3
        tv_for_loop_4.text = for_loop_4
        tv_for_loop_5.text= for_loop_5

        val while_loop = "while and do..while work as usual"

        tv_while_loop.text = while_loop
    }

    fun onPlay(propLayout: LinearLayout) {
        if (propLayout.visibility == View.VISIBLE) {
            propLayout.visibility = View.GONE
        } else {
            propLayout.visibility = View.VISIBLE
        }
    }
}
