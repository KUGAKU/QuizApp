package com.example.quizapp

object Constants {
    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1,
            "What country does this flag?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "test",
            "test",
            "test",
            1
        )
        questionsList.add(que1)
        val que2 = Question(
            1,
            "What country does this flag?",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "test",
            "test",
            "test",
            1
        )
        questionsList.add(que2)
        val que3 = Question(
            1,
            "What country does this flag?",
            R.drawable.ic_flag_of_belgium,
            "Argentina",
            "test",
            "test",
            "test",
            1
        )
        questionsList.add(que3)
        val que4 = Question(
            1,
            "What country does this flag?",
            R.drawable.ic_flag_of_brazil,
            "Argentina",
            "test",
            "test",
            "test",
            1
        )
        questionsList.add(que4)
        val que5 = Question(
            1,
            "What country does this flag?",
            R.drawable.ic_flag_of_denmark,
            "Argentina",
            "test",
            "test",
            "test",
            1
        )
        questionsList.add(que5)
        val que6 = Question(
            1,
            "What country does this flag?",
            R.drawable.ic_flag_of_fiji,
            "Argentina",
            "test",
            "test",
            "test",
            1
        )
        questionsList.add(que6)
        val que7 = Question(
            1,
            "What country does this flag?",
            R.drawable.ic_flag_of_germany,
            "Argentina",
            "test",
            "test",
            "test",
            1
        )
        questionsList.add(que7)
        val que8 = Question(
            1,
            "What country does this flag?",
            R.drawable.ic_flag_of_india,
            "Argentina",
            "test",
            "test",
            "test",
            1
        )
        questionsList.add(que8)
        val que9 = Question(
            1,
            "What country does this flag?",
            R.drawable.ic_flag_of_kuwait,
            "Argentina",
            "test",
            "test",
            "test",
            1
        )
        val que10 = Question(
            1,
            "What country does this flag?",
            R.drawable.ic_flag_of_new_zealand,
            "Argentina",
            "test",
            "test",
            "test",
            1
        )
        questionsList.add(que10)
        return  questionsList
    }
}