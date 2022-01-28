package lira.curso.quizapp

// preciso de: da questão,  imagem, as diferentes opções e qual a correta
// é bom ter um id para saber em qual questao está

data class Question(val id: Int, val question: String, val image: Int, val optionOne: String, val optionTwo: String, val optionThree: String, val optionFour: String, val correctAnswer: Int){

}
