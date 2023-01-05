package com.kotlin.basics

fun main() {

    // Array is a collection of multiples values.
    val students = arrayListOf("Abdullah", "Saleh", "Ahmed", "Fahd")

    // Loop through elements on the array
    for (student in students) {
        println(student)
    }

    // Loop through indexes on the array
    for (index in 0 until students.size) {
        println(index)
    }

    // To change the value of a specific element, refer to the index number
    for (index in 0 until  students.size) {
        if (students[index] == "Fahd") {
            val newStudent = "Mohammed"
            students[index] = newStudent
        }
    }

    println(students)

    // Add element (value) to the array
    students.add("Abdulrahman")
    println(students)

    // remove element (value) from the array
    students.remove("Saleh")
    println(students)

    // remove element (value) from the array by using the index of the element
    students.removeAt(1)
    println(students)

    /* Exercise 1:
    Declare an array variable that contains five elements of type boolean
    then replace all elements  to it's opposite value, after that print the array.
     */

    val array = arrayListOf(true, false, false, true, false)

    println(array)

    for (index in 0 until array.size) {
        array[index] = !array[index]
    }

    println(array)

}