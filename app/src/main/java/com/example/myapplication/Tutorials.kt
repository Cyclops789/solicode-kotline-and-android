package com.example.myapplication

fun main() {
    // Test comment
    val name: String = "Hamza";
    val age: Int = 20;
    val height: Double = 185.2;
    val money: Float = 2.3f;
    val dead: Boolean = false;
    var isDead: String? = null;

    if(dead) {
        isDead = "Dead";
    } else {
        isDead = "Not Dead";
    }

    println("Hello my name is $name, \nI'm $age years old, \nMy height is $height, \nI have $money$, \nAnd Im $isDead");

    var money2: Double = 2003.2;
    money2 += 2;
    var expense: Double = 92.5;

    println("I have $money2 in my account, after $expense of expenses i will have ${money2 - expense}");


    val today: String = "Today is Monday "
    val tomorrow: String = "Tomorrow is Tuesday"
    val fulltext: String = today + tomorrow
    println(fulltext);

    greeting(name =  "Hamza", age = 20);
}


fun greeting(name: String, age: Number): Unit {
    println("Hello $name, you are $age years old");
}