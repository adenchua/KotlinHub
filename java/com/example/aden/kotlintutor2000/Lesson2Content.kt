package com.example.aden.kotlintutor2000

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_lesson2_content.*

class Lesson2Content : AppCompatActivity() {

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson2_content)

        sharedPreferences = getSharedPreferences(myPreferences, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        val btn_Letsreview = findViewById<Button>(R.id.btn_letsreview_introductiontokotlin)
        btn_Letsreview.setOnClickListener {
            val myIntent = Intent(this, Revision2::class.java)
            startActivity(myIntent)
        }

        val btn_Backtohome = findViewById<Button>(R.id.btn_Backtohome)
        btn_Backtohome.setOnClickListener {
            val myIntent = Intent(this, MainMenuActivity::class.java)
            startActivity(myIntent)
        }

        val cardExpand = findViewById<CardView>(R.id.cv_declaring_variables)
        val propLayout = findViewById<LinearLayout>(R.id.card_expanded_declaringVariables)
        val cardExpand2 = findViewById<CardView>(R.id.cv_basic_variable_types)
        val propLayout2 = findViewById<LinearLayout>(R.id.card_expanded_basicVariableTypes)
        val cardExpand3 = findViewById<CardView>(R.id.cv_numbers)
        val propLayout3 = findViewById<LinearLayout>(R.id.card_expanded_numbers)
        val cardExpand4 = findViewById<CardView>(R.id.cv_arithmetic_operators)
        val propLayout4 = findViewById<LinearLayout>(R.id.card_expanded_arithmetic_operators)
        val cardExpand5 = findViewById<CardView>(R.id.cv_boolean)
        val propLayout5 = findViewById<LinearLayout>(R.id.card_expanded_boolean)
        val cardExpand6 = findViewById<CardView>(R.id.cv_strings)
        val propLayout6 = findViewById<LinearLayout>(R.id.card_expanded_strings)
        val cardExpand7 = findViewById<CardView>(R.id.cv_arrays)
        val propLayout7 = findViewById<LinearLayout>(R.id.card_expanded_arrays)
        val cardExpand8 = findViewById<CardView>(R.id.cv_comments)
        val propLayout8 = findViewById<LinearLayout>(R.id.card_expanded_comments)

        cardExpand.setOnClickListener {
            onPlay(propLayout)
            editor.putBoolean(L2C1, true)
            editor.apply()
        }

        cardExpand2.setOnClickListener {
            onPlay(propLayout2)
            editor.putBoolean(L2C2, true)
            editor.apply()
        }

        cardExpand3.setOnClickListener {
            onPlay(propLayout3)
            editor.putBoolean(L2C3, true)
            editor.apply()
        }

        cardExpand4.setOnClickListener {
            onPlay(propLayout4)
            editor.putBoolean(L2C4, true)
            editor.apply()
        }

        cardExpand5.setOnClickListener {
            onPlay(propLayout5)
            editor.putBoolean(L2C5, true)
            editor.apply()
        }

        cardExpand6.setOnClickListener {
            onPlay(propLayout6)
            editor.putBoolean(L2C6, true)
            editor.apply()
        }

        cardExpand7.setOnClickListener {
            onPlay(propLayout7)
            editor.putBoolean(L2C7, true)
            editor.apply()
        }

        cardExpand8.setOnClickListener {
            onPlay(propLayout8)
            editor.putBoolean(L2C8, true)
            editor.apply()
        }

        val declaring_variables = "Kotlin is a strongly typed language that supports type inference or deduction. " +
                "This is the mechanism employed by the compiler to find out types from context. Java doesn't have a type " +
                "inference mechanism, which means you must explicitly declare the type of every function or variable. Type inference " +
                "helps reduce the boilerplate code you have to write. \n\n" +
                "In Kotlin, we use val to declare a constant or var keywords to declare a variable. Though the compiler can implicitly infer " +
                "the type using type inference, we can specify a type such as String or Int after the variable name.\n\n" +
                "The difference between the val and the var keywords is that the former is immutable or read-only (its value cannot be changed), " +
                "while the latter is mutable (its value can be changed)\n\n" +
                "Note that for a variable declared with the var keyword which has its type inferred by the compiler, assigning another value of a different type will not work."

        // START HERE
        val helloworld = "Hello World 123423432"
        val spannable = SpannableStringBuilder(helloworld)
        spannable.setSpan(ForegroundColorSpan(Color.BLUE), 5, 10, Spannable.SPAN_INCLUSIVE_INCLUSIVE)

        tv_declaringVariables1.text = declaring_variables

        // ENDS HERE

        val basic_variable_types = "In Java, we have two types of type, primitive (int, long, boolean, byte,char, etc) and reference types. (array, String, etc) Java uses wrappers " +
                "(like java.lang.Integer) to make primitive types behave like objects.\n" +
                "\n" +
                "In Kotlin, everything is an object in the sense that we can call member functions and properties on any variable.\n" +
                "\n" +
                "There are five basic variable types used in Kotlin: numbers, characters, booleans, arrays and strings\n"

        tv_basic_variable_types.text = basic_variable_types

        val numbers = "There are 6 ways to represent numbers in Kotlin: Double, Float, Long, Int, Short and Byte.\n\n" +
                "       The integer types available in Kotlin are: \n" +
                "           Long - 64 bit\n" +
                "           Int - 32 bit\n" +
                "           Short - 16 bit\n" +
                "           Byte - 8 bit \n\n" +
                "       The floating-point types are: \n" +
                "           Double - 64 bit\n" +
                "           Float - 32 bit\n\n" +
                "Each number type has helper functions that convert from one number type to another." +
                "(toByte(), toInt(), toLong(), toFloat(), toDouble(), toChar(), toShort())\n\n" +
                "Since Kotlin 1.1, underscores can be added to make number constants more readable."

        tv_numbers.text = numbers

        val arithmetic_operator = "Addition: \n" +
                "       1+1 = 2\n\n" +
                "Subtraction: \n" +
                "       43-3 = 40\n\n" +
                "Multiplication: \n" +
                "       8*3 = 24\n\n" +
                "Division: \n" +
                "       1/2 = 0\n" +
                "       1.0/2.0 = 0.5\n" +
                "       50/10 = 5 //integer division always returns an integer.\n\n" +
                "Comparison:\n" +
                "       - Equality Checks: a == b and a != b\n" +
                "       - Comparison Operators: a < b, a > b, a <= b, a >= b\n" +
                "       - Range instantiation and range checks: a..b, x in a..b, x !in a..b\n"

        tv_arithmetic_operator.text = arithmetic_operator

        val boolean = "The Boolean type in Kotlin is the same as in Java. Its value can be either true or false. The operations disjunction (||), " +
                "conjunction (&&) and negation (!) can be performed on boolean types, just like Java.\n"

        tv_boolean.text = boolean

        tv_strings1.text = "Strings can either be created with either double quotes or triple quotes. In addition, escape characters can be used with double quotes."
        tv_strings2.text = "To create a string that spans multiple lines in the source file, we use triple quotes:"
        tv_strings3.text = "Kotlin also supports string interpolation or string templates. This is an easier way to build dynamic strings than concatenation, which is what we use in Java. Using string templates, we can insert variables and expressions into a string."
        tv_strings4.text = "What about if you need to use \$ in your string? You just escape it with \\\$! Also, you can call methods from an interpolated String directly; you have to add curly braces \${} to wrap it. "
        tv_strings5.text = "Another cool thing you can do is to perform some logic inside the curly braces when creating a String literal."

        val array1 = "There are two main ways to create an array: Using the constructor Array() or the helper function arrayOf().\n\n" +
                "Array() Constructor\n" +
                "The constructor of this class requires a size and a lambda function. The job of the lambda function is to initialize the array with elements."

        tv_array1.text = array1
        tv_array2.text = "In the code above, we passed 3 as the size of the array in the first argument. The second argument takes in a lambda function, which takes in the index of the element and returns the value to be " +
                "inserted at that index of the array. In this case, an array is created with elements 0, 3, 6."

        tv_comments.text = "In Kotlin, comments are made using block or line comments"

    }

    fun onPlay(propLayout: LinearLayout) {
        if (propLayout.visibility == View.VISIBLE) {
            propLayout.visibility = View.GONE
        } else {
            propLayout.visibility = View.VISIBLE
        }
    }
}
