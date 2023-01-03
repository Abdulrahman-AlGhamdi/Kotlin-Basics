package com.kotlin.basics

fun main() {

    // Assignment operator: (=) assign value to variable
    val name = "Abdullah"
    var number1 = 9
    var number2 = 3
    val isAwake = true
    val isSunny = false
    println("Name: $name, First Number: $number1, Second Number: $number2, Is Awake: $isAwake, Is Sunny: $isSunny")

    // Addition Operator: (+) Adds two values together
    println("Addition: ${number1 + number2}")

    // Subtraction Operator: (-) Subtracts one value from another
    println("Subtraction: ${number1 - number2}")

    // Multiplication Operator: (*) Multiplies two values
    println("Multiplication: ${number1 * number2}")

    // Division Operator: (/) Divides one value from another
    println("Division: ${number1 / number2}")

    // Modulus Operator: (%) Returns the division remainder
    println("ModulusL: ${number1 % number2}")

    // Incremental Operator: (++) Increases the value by 1
    number2++
    println("Incremental: $number2")

    // Decremental Operator: (--) Decreases the value by 1
    number1--
    println("Decremental: $number1")

    // Equal Operator: (==)
    println("Is number1 equal number2: ${number1 == number2}")

    // Not equal Operator: (!=)
    println("Is number1 Not equal number2: ${number1 != number2}")

    // Greater than Operator: (>)
    println("Is number1 grater than number2: ${number1 > number2}")

    // Less than Operator: (<)
    println("Is number1 less than number2: ${number1 < number2}")

    // Greater than or equal Operator: (>=)
    println("Is number1 greater than or equal number2: ${number1 >= number2}")

    // Less than or equal Operator: (<=)
    println("Is number1 less than or equal number2: ${number1 <= number2}")

    /*
    And Operator: (&&)
    true && true = true
    false && true = false
    false && false = false
    */
    println("isAwake and isSunny: ${isAwake && isSunny}")

    /*
    Or Operator: (||)
    true || true = true
    false || true = true
    false || false = false
    */
    println("isAwake or isSunny: ${isAwake || isSunny}")

    // Not Operator: (!)
    println("Is Abdullah awake: ${!isAwake}")

}