fun main(args: Array<String>) {
    // Define questions and answers, they need to line-up ie: Q[1] => A[1]
    var Question = arrayOf("What sport hosts the Superbowl", "Name the NFL team from Chicago",
        "What NFL player is nicknamed the GOAT (last name only)", "Which city hosts the NFL Hall of Fame",
        "Which team to Bears fans not like (team name only, omit the city)")
    var Answers = arrayOf("football", "bears", "brady", "canton", "packers")

    var entry = "X"
    var count = 0
    var correct = 0
    var result = 0

    // Loop through each question, based on the size of the Array: Question
    while (count < Question.size) {
        // Print Question, get user entry for Answer, if the user entry is correct, increment the # correct answers
        print("Q${count+1}:  ${Question[count]}: ")
        entry = readLine()!!.toString()
        result = entry.compareTo(Answers[count],ignoreCase = true)
        if (result == 0) {
            println("Correct")
            correct++
        }
        count++
    }

    println("Number of correct answers = $correct")
    println("Program arguments: ${args.joinToString()}")
}