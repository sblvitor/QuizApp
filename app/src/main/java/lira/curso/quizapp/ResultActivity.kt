package lira.curso.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvMessage: TextView = findViewById(R.id.tvMessage)
        val tvName: TextView = findViewById(R.id.tvName)
        val tvScore: TextView = findViewById(R.id.tvScore)
        val btnFinish: Button = findViewById(R.id.btnFinish)

        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        when(correctAnswers){
            in 0..3 -> tvMessage.text = "You're trash!!"
            in 4..7 -> tvMessage.text = "Hey, you can do better!"
            in 8..10 -> tvMessage.text = "WOW! Congrats!!"
        }

        tvName.text = intent.getStringExtra(Constants.USER_NAME)

        tvScore.text = "Your score is $correctAnswers out of ${intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)}"

        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

    }


}