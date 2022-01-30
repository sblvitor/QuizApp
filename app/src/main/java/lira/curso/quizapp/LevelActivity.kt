package lira.curso.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LevelActivity : AppCompatActivity() {

    private var mUserName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level)

        mUserName = intent.getStringExtra(Constants.USER_NAME)

        val btnEasy: Button = findViewById(R.id.btnEasy)
        val btnMedium: Button = findViewById(R.id.btnMedium)
        val btnHard: Button = findViewById(R.id.btnHard)

        btnEasy.setOnClickListener {
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, mUserName)
            intent.putExtra(Constants.LEVEL, "easy")
            startActivity(intent)
            finish()
        }

        btnMedium.setOnClickListener {
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, mUserName)
            intent.putExtra(Constants.LEVEL, "medium")
            startActivity(intent)
            finish()
        }

        btnHard.setOnClickListener {
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, mUserName)
            intent.putExtra(Constants.LEVEL, "hard")
            startActivity(intent)
            finish()
        }
    }
}