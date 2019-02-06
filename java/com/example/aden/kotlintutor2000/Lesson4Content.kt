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
import kotlinx.android.synthetic.main.activity_lesson4_content.*

class Lesson4Content : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    private var myPreferences = "myPrefs"
    private var L4C1 = "Lesson4 Content1"
    private var L4C2 = "Lesson4 Content2"
    private var L4C3 = "Lesson4 Content3"
    private var L4C4 = "Lesson4 Content4"
    private var L4C5 = "Lesson4 Content5"
    private var L4C6 = "Lesson4 Content6"
    private var L4C7 = "Lesson4 Content7"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson4_content)

        sharedPreferences = getSharedPreferences(myPreferences, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        val btn_Letsreview = findViewById<Button>(R.id.btn_letsreview_introductiontokotlin)
        btn_Letsreview.setOnClickListener {
            val myIntent = Intent(this, Revision4::class.java)
            startActivity(myIntent)
        }

        val btn_Backtohome = findViewById<Button>(R.id.btn_Backtohome)
        btn_Backtohome.setOnClickListener {
            val myIntent = Intent(this, MainMenuActivity::class.java)
            startActivity(myIntent)
        }

        val cardExpand = findViewById<CardView>(R.id.cv_kotlin_functions)
        val propLayout = findViewById<LinearLayout>(R.id.card_expanded_kotlinfunctions)
        val cardExpand2 = findViewById<CardView>(R.id.cv_types_of_functions)
        val propLayout2 = findViewById<LinearLayout>(R.id.card_expanded_types_of_functions)
        val cardExpand3 = findViewById<CardView>(R.id.cv_kotlin_standard_library_function)
        val propLayout3 = findViewById<LinearLayout>(R.id.card_expanded_kotlin_standard_library_function)
        val cardExpand4 = findViewById<CardView>(R.id.cv_user_defined_functions)
        val propLayout4 = findViewById<LinearLayout>(R.id.card_expanded_user_defined_functions)
        val cardExpand5 = findViewById<CardView>(R.id.cv_how_to_call_a_function)
        val propLayout5 = findViewById<LinearLayout>(R.id.card_expanded_how_to_call_a_function)
        val cardExpand6 = findViewById<CardView>(R.id.cv_how_functions_work)
        val propLayout6 = findViewById<LinearLayout>(R.id.card_expanded_how_functions_work)
        val cardExpand7 = findViewById<CardView>(R.id.cv_lambda_expressions)
        val propLayout7 = findViewById<LinearLayout>(R.id.card_expanded_lambda_expressions)

        cardExpand.setOnClickListener {
            onPlay(propLayout)
            editor.putBoolean(L4C1, true)
            editor.apply()
        }

        cardExpand2.setOnClickListener {
            onPlay(propLayout2)
            editor.putBoolean(L4C2, true)
            editor.apply()
        }

        cardExpand3.setOnClickListener {
            onPlay(propLayout3)
            editor.putBoolean(L4C3, true)
            editor.apply()
        }

        cardExpand4.setOnClickListener {
            onPlay(propLayout4)
            editor.putBoolean(L4C4, true)
            editor.apply()
        }

        cardExpand5.setOnClickListener {
            onPlay(propLayout5)
            editor.putBoolean(L4C5, true)
            editor.apply()
        }

        cardExpand6.setOnClickListener {
            onPlay(propLayout6)
            editor.putBoolean(L4C6, true)
            editor.apply()
        }

        cardExpand7.setOnClickListener {
            onPlay(propLayout7)
            editor.putBoolean(L4C7, true)
            editor.apply()
        }

        val kotlin_functions_1 = "In programming, function is a group of related statements that perform a specific task.\n\n" +
                "Functions are used to break a large program into smaller and modular chunks. For example, you need to create and color a circle based on input from the user. You can create two functions to solve this problem:\n\n" +
                "- createCircle() Function\n" +
                "- colorCircle() Function\n\n" +
                "Dividing a complex program into smaller components makes our program more organized and manageable.\n\n" +
                "Furthermore, it avoids repetition and makes code reusable."

        tv_kotlin_functions_1.text = kotlin_functions_1

        val types_of_functions_1 = "Depending on whether a function is defined by the user, or available in standard library, there are two types of functions:\n\n" +
                "- Kotlin Standard Library Function\n" +
                "- User-defined functions"

        tv_types_of_functions_1.text = types_of_functions_1

        val kotlin_standard_library_function_1 = "The standard library functions are built-in functions in Kotlin that are readily available for use. For example,\n\n" +
                "- print() is a library function that prints message to the standard output stream (monitor).\n" +
                "- sqrt() returns square root of a number (Double value)"
        val kotlin_standard_library_function_2 = "When you run the program, the output will be:"

        tv_kotlin_standard_library_function_1.text = kotlin_standard_library_function_1
        tv_kotlin_standard_library_function_2.text = kotlin_standard_library_function_2

        val user_defined_functions_1 = "As mentioned, you can create functions yourself. Such functions are called user-defined functions."
        val user_defined_functions_2 = "How to create a user-defined functions in Kotlin?\n\n" +
                "Before you can use (call) a function, you need to define it.\n\n" +
                "Here's how you can define a function in Kotlin:"
        val user_defined_functions_3 = "To define a function in Kotlin, fun keyword is used. Then comes the name of the function (identifier). Here, the name of the function is callMe.\n\n" +
                "In the above program, the parenthesis ( ) is empty. It means, this function doesn't accept any argument. You will learn about arguments later in this article.\n\n" +
                "The codes inside curly braces { } is the body of the function."

        tv_user_defined_functions_1.text = user_defined_functions_1
        tv_user_defined_functions_2.text = user_defined_functions_2
        tv_user_defined_functions_3.text = user_defined_functions_3

        val how_to_call_a_function_1 = "You have to call the function to run codes inside the body of the function. Here's how:"
        val how_to_call_a_function_2 = "This statement calls the callMe() function declared earlier."
        val how_to_call_a_function_3 = "Example: Simple Function Program"
        val how_to_call_a_function_4 = "When you runt the program, the output will be:"
        val how_to_call_a_function_5 = "The callMe() function in the above code doesn't accept any argument.\n\n" +
                "Also, the function doesn't return any value (return type is Unit).\n\n" +
                "Let's take another function example. This function will accept arguments and also returns a value."
        val how_to_call_a_function_6 = "Example: Add Two Numbers Using Function"
        val how_to_call_a_function_7 = "When you run the program, the output will be:"

        tv_how_to_call_a_function_1.text = how_to_call_a_function_1
        tv_how_to_call_a_function_2.text = how_to_call_a_function_2
        tv_how_to_call_a_function_3.text = how_to_call_a_function_3
        tv_how_to_call_a_function_4.text = how_to_call_a_function_4
        tv_how_to_call_a_function_5.text = how_to_call_a_function_5
        tv_how_to_call_a_function_6.text = how_to_call_a_function_6
        tv_how_to_call_a_function_7.text = how_to_call_a_function_7

        val how_functions_work_1 = "Here, two arguments number1 and number2 of type Double are passed to the addNumbers() function during function call. These arguments are called actual arguments."
        val how_functions_work_2 = "The parameters n1 and n2 accepts the passed arguments (in the function definition). These arguments are called formal arguments (or parameters)."
        val how_functions_work_3 = "In Kotlin, arguments are separated using commas. Also, the type of the formal argument must be explicitly typed.\n\n" +
                "Note that, the data type of actual and formal arguments should match, i.e., the data type of first actual argument should match the type of first formal argument. Similarly, the type of second actual argument must match the type of second formal argument and so on.\n\n" +
                "Here,"
        val how_functions_work_4 = "is the return statement. This code terminates the addNumbers() function, and control of the program jumps to the main() function.\n\n" +
                "In the program, sumInteger is returned from addNumbers() function. This value is assigned to the variable result."
        val how_functions_work_5 = "Notice,\n\n" +
                "- both sumInteger and result are of type Int.\n" +
                "- the return type of the function is specified in the function definition."
        val how_functions_work_6 = "If the function doesn't return any value, its return type is Unit. It is optional to specify the return type in the function definition if the return type is Unit."
        val how_functions_work_7 = "Example: Display Name by Using Function"
        val how_functions_work_8 = "When you run the program, the output will be:"
        val how_functions_work_9 = "Here, the getName() function takes two String arguments, and returns a String.\n\n" +
                "You can omit the curly braces { } of the function body and specify the body after = symbol if the function returns a single expression (like above example).\n\n" +
                "It is optional to explicitly declare the return type in such case because the return type can be inferred by the compiler. In the above example, you can replace"
        val how_functions_work_10 = "with"

        tv_how_functions_work_1.text = how_functions_work_1
        tv_how_functions_work_2.text = how_functions_work_2
        tv_how_functions_work_3.text = how_functions_work_3
        tv_how_functions_work_4.text = how_functions_work_4
        tv_how_functions_work_5.text = how_functions_work_5
        tv_how_functions_work_6.text = how_functions_work_6
        tv_how_functions_work_7.text = how_functions_work_7
        tv_how_functions_work_8.text = how_functions_work_8
        tv_how_functions_work_9.text = how_functions_work_9
        tv_how_functions_work_10.text = how_functions_work_10

        val lambda_expressions_1 = "Lambda expression or simply lambda is an anonymous function; a function without name. These functions are passed immediately as an expression without declaration. For example,"
        val lambda_expressions_2 = "When you run the program, the output will be:"
        val lambda_expressions_3 = "Here, a lambda expression is assigned to variable greeting. The expression doesn't accept any parameters and doesn't return any value in this program.\n\n" +
                "Then, the function (lambda expression) is invoked as:"

        tv_lambda_expressions_1.text = lambda_expressions_1
        tv_lambda_expressions_2.text = lambda_expressions_2
        tv_lambda_expressions_3.text = lambda_expressions_3
    }

    fun onPlay(propLayout: LinearLayout) {
        if (propLayout.visibility == View.VISIBLE) {
            propLayout.visibility = View.GONE
        } else {
            propLayout.visibility = View.VISIBLE
        }
    }

}
