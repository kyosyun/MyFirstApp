package com.example.trainingapp

class Person {
    private var name: String = ""
    private var age: Int = 0

    fun Person(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun getName(): String {
        return name
    }

    fun getAge(): Int {
        return age
    }
}