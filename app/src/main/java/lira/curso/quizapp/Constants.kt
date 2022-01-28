package lira.curso.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Uruguai", "Honduras", "Argentina", "Armenia",
            3
        )

        questionList.add(que1)

        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Alemanha", "França", "Dinamarca", "Belgica",
            1
        )

        questionList.add(que2)

        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Israel", "Irlanda", "India", "Costa do marfim",
            3
        )

        questionList.add(que3)

        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Islândia", "Nova Zelândia", "Inglaterra", "Austrália",
            4
        )

        questionList.add(que4)

        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Equador", "Brazil", "Peru", "Marrocos",
            2
        )

        questionList.add(que5)

        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Tailândia", "Somália", "Reino Unido", "Fiji",
            4
        )

        questionList.add(que6)

        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Nova Zelândia", "Austrália", "Reino Unido", "Inglaterra",
            1
        )

        questionList.add(que7)

        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Rússia", "Itália", "Bélgica", "Alemanha",
            3
        )

        questionList.add(que8)

        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Inglaterra", "Dinamarca", "Peru", "Suiça",
            2
        )

        questionList.add(que9)

        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Sudão", "Emirados Árabes Unidos", "Jordânia",
            1
        )

        questionList.add(que10)

        /*val que11 = Question(
            11, "What country does this flag belong to?",
            R.drawable.ic_flag_of_chile,
            "Paraguai", "República Tcheca", "Chile", "Eslováquia",
            3
        )

        questionList.add(que11)*/

        return questionList
    }

}