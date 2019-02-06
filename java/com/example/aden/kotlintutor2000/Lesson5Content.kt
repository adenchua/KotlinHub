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
import kotlinx.android.synthetic.main.activity_lesson5_content.*

class Lesson5Content : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    private var myPreferences = "myPrefs"
    private var L5C1 = "Lesson5 Content1"
    private var L5C2 = "Lesson5 Content2"
    private var L5C3 = "Lesson5 Content3"
    private var L5C4 = "Lesson5 Content4"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson5_content)

        sharedPreferences = getSharedPreferences(myPreferences, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        val btn_Letsreview = findViewById<Button>(R.id.btn_letsreview_introductiontokotlin)
        btn_Letsreview.setOnClickListener {
            val myIntent = Intent(this, Revision5::class.java)
            startActivity(myIntent)
        }

        val btn_Backtohome = findViewById<Button>(R.id.btn_Backtohome)
        btn_Backtohome.setOnClickListener {
            val myIntent = Intent(this, MainMenuActivity::class.java)
            startActivity(myIntent)
        }

        val cardExpand = findViewById<CardView>(R.id.cv_kotlin_class_and_objects)
        val propLayout = findViewById<LinearLayout>(R.id.card_expanded_kotlin_class_and_objects)
        val cardExpand2 = findViewById<CardView>(R.id.cv_oop)
        val propLayout2 = findViewById<LinearLayout>(R.id.card_expanded_oop)
        val cardExpand3 = findViewById<CardView>(R.id.cv_kotlin_class)
        val propLayout3 = findViewById<LinearLayout>(R.id.card_expanded_kotlin_class)
        val cardExpand4 = findViewById<CardView>(R.id.cv_kotlin_objects)
        val propLayout4 = findViewById<LinearLayout>(R.id.card_expanded_kotlin_objects)

        cardExpand.setOnClickListener {
            onPlay(propLayout)
            editor.putBoolean(L5C1, true)
            editor.apply()
        }

        cardExpand2.setOnClickListener {
            onPlay(propLayout2)
            editor.putBoolean(L5C2, true)
            editor.apply()
        }

        cardExpand3.setOnClickListener {
            onPlay(propLayout3)
            editor.putBoolean(L5C3, true)
            editor.apply()
        }

        cardExpand4.setOnClickListener {
            onPlay(propLayout4)
            editor.putBoolean(L5C4, true)
            editor.apply()
        }

        val kotlin_class_and_objects_1 = "Kotlin supports both functional and object-oriented programming.\n\n" +
                "Kotlin supports features such as higher-order functions, function types and lambdas which makes it a great choice for working in functional programming style. You will learn about these concept in later chapters. This article will focus on object-oriented style of programming in Kotlin."

        tv_kotlin_class_and_objects_1.text = kotlin_class_and_objects_1

        val oop_1 = "In object-oriented style of programming, you can divide a complex problem into smaller sets by creating objects.\n\n" +
                "These objects share two characteristics:\n\n" +
                "- state\n" +
                "- behavior\n\n" +
                "Let's take few examples:\n\n" +
                "1. Lamp is an object\n" +
                "- It can be in on or off state.\n" +
                "- You can turn on and turn off lamp (behavior).\n\n" +
                "2. Bicycle is an object\n" +
                "- It has current gear, two wheels, number of gear etc. state.\n" +
                "- It has braking, accelerating, changing gears etc. behavior.\n\n" +
                "You can learn about detail features of an object-oriented programming like: data encapsulation, inheritance and polymorphism. But this lesson will focus on the basics to keep things simple."

        tv_oop_1.text = oop_1

        val kotlin_class_1 = "Before you create objects in Kotlin, you need to define a class.\n\n" +
                "A class is a blueprint for the object.\n\n" +
                "We can think of class as a sketch (prototype) of a house. It contains all the details about the floors, doors, windows etc. Based on these descriptions we build the house. House is the object.\n\n" +
                "Since, many houses can be made from the same description, we can create many objects from a class."
        val kotlin_class_2 = "How to define a class in Kotlin?\n\n" +
                "To define a class in Kotlin, class keyword is used:"
        val kotlin_class_3 = "Here's an example:"
        val kotlin_class_4 = "Here, we defined a class named Lamp.\n\n" +
                "The class has one property isOn (defined in same way as variable), and two member functions turnOn() and turnOff().\n\n" +
                "In Kotlin, either the property must be initialized or must be declared abstract. In the above example, isOn property is initialized to false.\n\n" +
                "Classes, objects, properties, member function etc. can have visibility modifiers. For example, the isOn property is private. This means, the isOn property can be changed from only inside the Lamp class.\n\n" +
                "Other visibility modifiers are:\n\n" +
                "- private - visible (can be accessed) from inside the class only.\n" +
                "- public - visible everywhere.\n" +
                "- protected - visible to the class and its subclass.\n" +
                "- internal - any client inside the module can access them.\n\n" +
                "If you do not specify the visibility modifier, it will be public by default.\n\n" +
                "In the above program, turnOn() and turnOff() member functions are public whereas, isOn property is private."

        tv_kotlin_class_1.text = kotlin_class_1
        tv_kotlin_class_2.text = kotlin_class_2
        tv_kotlin_class_3.text = kotlin_class_3
        tv_kotlin_class_4.text = kotlin_class_4

        val kotlin_objects_1 = "When class is defined, only the specification for the object is defined; no memory or storage is allocated.\n\n" +
                "To access members defined within the class, you need to create objects. Let's create objects of Lamp class."
        val kotlin_objects_2 = "This program creates two objects l1 and l2 of class Lamp. The isOn property for both lamps l1 and l2 will be false."
        val kotlin_objects_3 = "How to access members?\n\n" +
                "You can access properties and member functions of a class by using . notation. For example,"
        val kotlin_objects_4 = "This statement calls turnOn() function for l1 object.\n\n" +
                "Let's take another example:"
        val kotlin_objects_5 = "Here, we tried to assign true to isOn property of l2 object. Note that, isOn property is private, and if you try to access isOn from outside the class, an exception is thrown."

        tv_kotlin_objects_1.text = kotlin_objects_1
        tv_kotlin_objects_2.text = kotlin_objects_2
        tv_kotlin_objects_3.text = kotlin_objects_3
        tv_kotlin_objects_4.text = kotlin_objects_4
        tv_kotlin_objects_5.text = kotlin_objects_5

    }

    fun onPlay(propLayout: LinearLayout) {
        if (propLayout.visibility == View.VISIBLE) {
            propLayout.visibility = View.GONE
        } else {
            propLayout.visibility = View.VISIBLE
        }
    }
}
