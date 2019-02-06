package com.example.aden.kotlintutor2000

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class KotlinEvolutionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_evolution)

        var tvTooltip = findViewById<TextView>(R.id.tv_kotlin_evolution_tooltip)
        tvTooltip.setText(
            "   Principles of Pragmatic Evolution" + "\n"
                    + "\n"
                    + "         \"Language design is cast in stone," + "\n"
                    + "         but this stone is reasonably soft," + "\n"
                    + "         and with some effort we can " + "\n"
                    + "         reshape it later.\"" + "\n"
                    + "\n"
                    + "         Kotlin Design Team" + "\n"
        )

        var tvContent = findViewById<TextView>(R.id.tv_kotlin_evolution_content)
        tvContent.setText(
            "Kotlin is designed to be a pragmatic tool for programmers. When it comes to language evolution, its pragmatic nature is captured by the following principles:" + "\n"
                    + "- Keep the language modern over the years." + "\n"
                    + "- Stay in the constant feedback loop with the users." + "\n"
                    + "- Make updating to new versions comfortable for the users." + "\n"
                    + "\n"
                    + "As this is key to understanding how Kotlin is moving forward, let's expand on these principles."
                    + "\n"
                    + "\n"
                    + "Keeping the Language Modern. We acknowledge that systems accumulate legacy over time. What had once been cutting-edge technology can be hopelessly outdated today. " +
                    "We have to evolve the language to keep it relevant to the needs of the users and up-to-date with their expectations. This includes not only adding new features, but also phasing " +
                    "out old ones that are no longer recommended for production use and have altogether become legacy."
                    + "\n"
                    + "\n"
                    + "Comfortable Updates. Incompatible changes, such as removing things from a language, may lead to painful migration from one version to the next if carried out without proper care. We will always " +
                    "announce such changes well in advance, mark things as deprecated and provide automated migration tools before the change happens. By the time the language is changed we want most of the code in the " +
                    "world to be already updated and thus have no issues migrating to the new version."
                    + "\n"
                    + "\n"
                    + "Feedback Loop. Going through deprecation cycles requires significant effort, so we want to minimize the number of incompatible changes we'll be making in the future. Apart from using our best judgement, we believe " +
                    "that trying things out in real life is the best way to validate a design. Before casting things in stone we want them battle-tested. This is why we use every opportunity to make early versions of our designs " +
                    "available in production versions of the language, but with experimental status. Experimental features are not stable, they can be changed at any time, and the users that opt into using them do so explicitly to indicate " +
                    "that they are ready to deal with the future migration issues. These users provide invaluable feedback that we gather to iterate on the design and make it rock-solid."
                    + "\n"

        )
    }
}
