package com.example.aden.kotlintutor2000

class GameQuestions {

    val mQuestions = arrayOf(
        "What is the difference between val and var in Kotlin\n\n" +
                "A: Variables declared with var are final, those with val are not.\n" +
                "B: var is scoped to the nearest function block and val is scoped to the nearest enclosing block\n" +
                "C: Variables declared with val can only access const members\n" +
                "D: Variables declared with val are final, those with var are not.",
        "What does this code do?\n" +
                "       foo()()\n\n" +
                "A: Fails compilation\n" +
                "B: Calls foo asynchronously\n" +
                "C: Creates a two-dimensional array\n" +
                "D: Calls a function which is returned by the call of foo",
        "Which of these targets does Kotlin currently not support?\n\n" +
                "A: JVM\n" +
                "B: LLVM\n" +
                "C: JavaScript\n" +
                "D: .NET CLR",
        "What is to in the example below:\n" +
                "       val test = 33 to 42\n\n" +
                "A: A Kotlin keyword to create a Pair(33, 42)\n" +
                "B: A Kotlin keyword to create a Range from 33 to 42\n" +
                "C: An infix extension function creating a Pair(33,42)\n" +
                "D: A syntax error",
        "What is the correct way to declare a variable of integer type in Kotlin?\n\n" +
                "A: let i = 42\n" +
                "B: int i = 42\n" +
                "C: var i : Int = 42\n" +
                "D: var i : int = 42"
    )

    val mCorrectAnswers = arrayOf("D", "D", "D", "C", "C")
}