package com.kotlin.basics

fun main() {
    val student1 = Student("Abdulrahman", "Math")
    val student2 = Student("Saleh", "CS")

    val school = School()
    school.printStudent(student2)
    school.changeSubject(student1, "Programming")
}

data class Student(val name: String, var subject: String)

class School {

    fun printStudent(student: Student) {
        println("Name: ${student.name}, Subject: ${student.subject}")
    }

    fun changeSubject(student: Student, subject: String) {
        println("Old Subject: ${student.subject}")
        student.subject = subject
        println("New Subject: ${student.subject}")
    }
}