package com.kotlin.basics

fun main() {

    /*
    If used to execute a block of code when the condition is true
    else used to execute a block of code when the condition in false
    If else condition is preferred to used when there is 2 options of condition
    */

    val name = "Abdulrahman"

    if (name == "Saleh") {
        println("Ny name is $name")
    } else {
        println("Unknown Name!")
    }

    /*
    when is used to execute block of code when one of the conditions is true
    when condition is preferred to used when there is 3 or more options of condition.
    */

    val month = 3

    when (month) {
        1 -> {
            println("Jan")
        }
        2 -> {
            println("Feb")
        }
        3 -> {
            println("March")
        }
        4 -> {
            println("April")
        }
        else -> {
            println("Unknown Month!")
        }
    }

    /*
    If there is only single line expression no need to use the curly braces { }
    */

    val isSunny = true

    if (isSunny) println("Riyadh weather is really hot")
    else println("Riyadh weather is cold!")

    when {
        1 > 2 -> println("1 is bigger than 2")
        3 == 1 -> print("3 equal to 1")
        isSunny -> println("Riyadh is Sunny")
    }

}