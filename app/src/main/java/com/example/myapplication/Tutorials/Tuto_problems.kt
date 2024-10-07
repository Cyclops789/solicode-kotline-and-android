package com.example.myapplication.Tutorials

fun main() {
    // Print messages
    println("Use the val keyword when the value doesn't change. \nUse the var keyword when the value can change. \nWhen you define a function, you define the parameters that can be passed to it. \nWhen you call a function, you pass arguments for the parameters.")

    // Fix compile errors
    println("New chat message from a friend")

    // String templates
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)

    // String concatenation
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")

    // Message formatting
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "${baseSalary + bonusAmount}"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")

    // Implement basic math operations
    val firstNumber = 10
    val secondNumber = 5
    val result = firstNumber + secondNumber

    println("$firstNumber + $secondNumber = $result")

    fun add(firstNum: Int, secondNum: Int): Int {
        return firstNum + secondNum;
    }

    fun subtract(firstNum: Int, secondNum: Int): Int {
        return firstNum - secondNum;
    }

    val firstNumber2 = 10
    val secondNumber2 = 5
    val thirdNumber2 = 8

    val result2 = add(firstNumber2, secondNumber2)
    val anotherResult2 = add(firstNumber2, thirdNumber2)
    val suntractresult = subtract(firstNumber2, thirdNumber2)
    println("$firstNumber2 + $secondNumber2 = $result2")
    println("$firstNumber2 + $thirdNumber2 = $anotherResult2")
    println("$firstNumber2 - $thirdNumber2 = $suntractresult")

}