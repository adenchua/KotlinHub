package com.example.aden.kotlintutor2000

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class GameActivity : AppCompatActivity() {

    private var scoreOne = 0
    private var scoreTwo = 0
    private val gameQuestions = GameQuestions()
    private var answer = ""
    private val totalQuestions = gameQuestions.mQuestions.size
    private var currQuestion = 0

    lateinit var player_one_score :TextView
    lateinit var player_two_score :TextView
    lateinit var player_one_question :TextView
    lateinit var player_two_question :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        player_one_score = findViewById<TextView>(R.id.tv_score_1)
        player_two_score = findViewById<TextView>(R.id.tv_score_2)
        player_one_question = findViewById<TextView>(R.id.question_layout_player_1)
        player_two_question = findViewById<TextView>(R.id.question_layout_player_2)

        val btn_1_A = findViewById<Button>(R.id.btn_1_A)
        val btn_1_B = findViewById<Button>(R.id.btn_1_B)
        val btn_1_C = findViewById<Button>(R.id.btn_1_C)
        val btn_1_D = findViewById<Button>(R.id.btn_1_D)

        val btn_2_A = findViewById<Button>(R.id.btn_2_A)
        val btn_2_B = findViewById<Button>(R.id.btn_2_B)
        val btn_2_C = findViewById<Button>(R.id.btn_2_C)
        val btn_2_D = findViewById<Button>(R.id.btn_2_D)

        updateQuestion(0) // initialize question

        val back = findViewById<ImageView>(R.id.btn_home)
        back.setOnClickListener {
            finish()
        }

        btn_1_A.setOnClickListener {
            if (answer.equals("A")) { //correct, update p1 score, update question
                scoreOne++
                player_one_score.setText(scoreOne.toString())
                currQuestion++
                updateQuestion(currQuestion)
            }
            else { //wrong, update p1 score, update question
                scoreOne--
                player_one_score.setText(scoreOne.toString())
                currQuestion++
                updateQuestion(currQuestion)
            }
        }

        btn_1_B.setOnClickListener {
            if (answer.equals("B")) { //correct, update p1 score, update question
                scoreOne++
                player_one_score.setText(scoreOne.toString())
                currQuestion++
                updateQuestion(currQuestion)
            }
            else { //wrong, update p1 score, update question
                scoreOne--
                player_one_score.setText(scoreOne.toString())
                currQuestion++
                updateQuestion(currQuestion)
            }
        }

        btn_1_C.setOnClickListener {
            if (answer.equals("C")) { //correct, update p1 score, update question
                scoreOne++
                player_one_score.setText(scoreOne.toString())
                currQuestion++
                updateQuestion(currQuestion)
            }
            else { //wrong, update p1 score, update question
                scoreOne--
                player_one_score.setText(scoreOne.toString())
                currQuestion++
                updateQuestion(currQuestion)
            }
        }

        btn_1_D.setOnClickListener {
            if (answer.equals("D")) { //correct, update p1 score, update question
                scoreOne++
                player_one_score.setText(scoreOne.toString())
                currQuestion++
                updateQuestion(currQuestion)
            }
            else { //wrong, update p1 score, update question
                scoreOne--
                player_one_score.setText(scoreOne.toString())
                currQuestion++
                updateQuestion(currQuestion)
            }
        }


        btn_2_A.setOnClickListener {
            if (answer.equals("A")) { //correct, update p2 score, update question
                scoreTwo++
                player_two_score.setText(scoreTwo.toString())
                currQuestion++
                updateQuestion(currQuestion)
            }
            else { //wrong, update p2 score, update question
                scoreTwo--
                player_two_score.setText(scoreTwo.toString())
                currQuestion++
                updateQuestion(currQuestion)
            }
        }

        btn_2_B.setOnClickListener {
            if (answer.equals("B")) { //correct, update p2 score, update question
                scoreTwo++
                player_two_score.setText(scoreTwo.toString())
                currQuestion++
                updateQuestion(currQuestion)
            }
            else { //wrong, update p2 score, update question
                scoreTwo--
                player_two_score.setText(scoreTwo.toString())
                currQuestion++
                updateQuestion(currQuestion)
            }
        }

        btn_2_C.setOnClickListener {
            if (answer.equals("C")) { //correct, update p2 score, update question
                scoreTwo++
                player_two_score.setText(scoreTwo.toString())
                currQuestion++
                updateQuestion(currQuestion)
            }
            else { //wrong, update p2 score, update question
                scoreTwo--
                player_two_score.setText(scoreTwo.toString())
                currQuestion++
                updateQuestion(currQuestion)
            }
        }

        btn_2_D.setOnClickListener {
            if (answer.equals("D")) { //correct, update p2 score, update question
                scoreTwo++
                player_two_score.setText(scoreTwo.toString())
                currQuestion++
                updateQuestion(currQuestion)
            }
            else { //wrong, update p2 score, update question
                scoreTwo--
                player_two_score.setText(scoreTwo.toString())
                currQuestion++
                updateQuestion(currQuestion)
            }
        }
    }

    private fun updateQuestion(a: Int) {

        if (a < totalQuestions) { //update question when not end
            player_one_question.setText(gameQuestions.mQuestions.get(a))
            player_two_question.setText(gameQuestions.mQuestions.get(a))
            answer = gameQuestions.mCorrectAnswers.get(a) //update answer for that question
        } else {
            gameOver()
        }
    }

    private fun gameOver() {

        val alertDiaglogBuilder = AlertDialog.Builder(this@GameActivity)

        if ( scoreOne > scoreTwo ) { //player 1 wins
            alertDiaglogBuilder
                .setMessage("PLAYER ONE WINS")
                .setCancelable(false)
                .setNegativeButton("BACK") {dialog, which ->
                    finish()
                }
            val alertDialog = alertDiaglogBuilder.create()
            alertDialog.show()
        }
        else if ( scoreOne < scoreTwo ) { //player 2 wins
            alertDiaglogBuilder
                .setMessage("PLAYER TWO WINS")
                .setCancelable(false)
                .setNegativeButton("BACK") {dialog, which ->
                    finish()
                }
            val alertDialog = alertDiaglogBuilder.create()
            alertDialog.show()
        }
        else { //draw
            alertDiaglogBuilder
                .setMessage("DRAW")
                .setCancelable(false)
                .setNegativeButton("BACK") {dialog, which ->
                    finish()
                }
            val alertDialog = alertDiaglogBuilder.create()
            alertDialog.show()
        }


    }
}
