package lira.curso.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    const val LEVEL: String = "difficulty_level"

    fun getEasyQuestions(): ArrayList<Question>{
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
            R.drawable.ic_flag_of_spain,
            "Portugal", "Colombia", "Espanha", "Bélgica",
            3
        )

        questionList.add(que3)

        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_china,
            "Coreia do Norte", "Japão", "Albânia", "China",
            4
        )

        questionList.add(que4)

        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Equador", "Brasil", "Peru", "Marrocos",
            2
        )

        questionList.add(que5)

        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_chile,
            "Paraguai", "República Tcheca", "Chile", "Eslováquia",
            3
        )

        questionList.add(que6)

        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_eua,
            "Estados Unidos", "Malásia", "Reino Unido", "Canadá",
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
            R.drawable.ic_flag_of_canada,
            "Canadá", "Suiça", "Polônia", "Peru",
            1
        )

        questionList.add(que10)


        return questionList
    }

    fun getMediumQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Inglaterra", "Austrália", "Nova Zelândia", "Reino Unido",
            3
        )

        questionList.add(que1)

        val que2 = Question(2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_venezuela,
            "Colômbia", "Venezuela", "Equador", "Bolívia",
            2
        )

        questionList.add(que2)

        val que3 = Question(3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_iraq,
            "Iraque", "Irã", "Egito", "Líbia",
            1
        )

        questionList.add(que3)

        val que4 = Question(4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_norway,
            "Noruega", "Dinamarca", "Finlândia", "Islândia",
            1
        )

        questionList.add(que4)

        val que5 = Question(5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_netherlands,
            "França", "Rússia", "Luxemburgo", "Holanda",
            4
        )

        questionList.add(que5)

        val que6 = Question(6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_serbia,
            "Eslováquia", "Croácia", "Sérvia", "Eslovênia",
            3
        )

        questionList.add(que6)

        val que7 = Question(7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_israel,
            "Grécia", "Israel", "Uruguai", "Honduras",
            2
        )

        questionList.add(que7)

        val que8 = Question(8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_monaco,
            "Mônaco", "Peru", "Austria", "Polônia",
            1
        )

        questionList.add(que8)

        val que9 = Question(9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_panama,
            "Cuba", "Panamá", "Filipinas", "Costa Rica",
            2
        )

        questionList.add(que9)

        val que10 = Question(10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_turkey,
            "Tunísia", "Indonésia", "Vietnam", "Turquia",
            4
        )

        questionList.add(que10)

        return questionList

    }

    fun getHardQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_afghanistan,
            "Líbia", "Afeganistão", "Paquistão", "Emirados Árabes Unidos",
            2
        )

        questionList.add(que1)

        val que2 = Question(2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Malásia", "Tuvalu", "Fiji", "Reino Unido",
            3
        )

        questionList.add(que2)

        val que3 = Question(3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_sri_lanka,
            "Suriname", "Gambia", "Taiwan", "Sri Lanka",
            4
        )

        questionList.add(que3)

        val que4 = Question(4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_grenada,
            "Tajiquistão", "Granada", "Gabão", "Eritreia",
            2
        )

        questionList.add(que4)

        val que5 = Question(5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_tanzania,
            "Tanzânia", "Etiópia", "Quênia", "Trindade e Tobago",
            1
        )

        questionList.add(que5)

        val que6 = Question(6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_cyprus,
            "Montenegro", "Kosovo", "Chipre", "Albânia",
            3
        )

        questionList.add(que6)

        val que7 = Question(7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_st_lucia,
            "Bahamas", "Samoa", "Santa Lúcia", "Barbados",
            3
        )

        questionList.add(que7)

        val que8 = Question(8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brunei,
            "Camboja", "Nicarágua", "Palau", "Brunei",
            4
        )

        questionList.add(que8)

        val que9 = Question(9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_comoros,
            "Comores", "Djibouti", "Ruanda", "San Marino",
            1
        )

        questionList.add(que9)

        val que10 = Question(10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Sudão", "Emirados Árabes Unidos", "Jordânia",
            1
        )

        questionList.add(que10)

        return questionList
    }

    /*val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Islândia", "Nova Zelândia", "Inglaterra", "Austrália",
            4
        )*/

    /*val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Israel", "Irlanda", "India", "Costa do marfim",
            3
        )*/
}