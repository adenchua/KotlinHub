package com.example.aden.kotlintutor2000

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.text.Typography.degree

class AboutUsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)

        var tvAboutUs = findViewById<TextView>(R.id.tv_about_us_content)
        tvAboutUs.setText(
            "Kotlin Hub was founded on 20-October-2018 by two students from National University of Singapore, Chua You Liang and Yosafat C. Saputra." +
                    "The app was designed to introduce students into the world of programming through Kotlin."
        )

        var tvProfNg = findViewById<TextView>(R.id.tv_prof_ng)
        tvProfNg.setText(
            "Professor Ng is the module co-ordinator of IS3261, Mobile Apps Development For Enterprise. He has provided the team the necessary skillsets needed to create " +
                    "this mobile application. Without his guidance this app would not be possible."
        )


        var tvYouLiang = findViewById<TextView>(R.id.tv_you_liang)
        tvYouLiang.setText(
            "You Liang is the co-founder of Kotlin Hub. As a visionary person, he makes unrealistic goals like \"Lets complete the project, zip and submit in IVLE within 24 hours.\" " +
                    "He drinks two cups of coffee everyday in order to stay awake, looking through Youtube video tutorials and Stackoverflow forums to solve " +
                    "android programming problems encounted in the project. He is also the greedier co-founder that decided to put his paypal donation link on the app."

        )
        var tvYosafat = findViewById<TextView>(R.id.tv_yosafat)
        tvYosafat.setText(
            "Yosafat is the co-founder of Kotlin Hub. Under the oppression of You Liang's regime, he started to question the meaning of life when working the project within 24 hours. " +
                    "He likes to wear red stinky socks and white wife-beater shirt when doing the assignment so nobody will disturb him. He also loves the idea " +
                    "of putting paypal donation link on the app."
        )

        var tvAcknowledgements = findViewById<TextView>(R.id.tv_acknowledgments)
        tvAcknowledgements.setText(
            "We could like to acknowledge the following websites for providing Kotlin Hub the contents used in the application:\n\n" +
                    "- https://kotlinlang.org/\n\n" +
                    "- https://kotlinquiz.com/\n\n" +
                    "- https://code.tutsplus.com/tutorials/kotlin-from-scratch-variables-basic-types-arrays-type-inference-and-comments--cms-29328\n\n" +
                    "- https://www.programiz.com/kotlin-programming/functions\n\n" +
                    "- https://www.programiz.com/kotlin-programming/class-objects\n"

        )
    }
}
