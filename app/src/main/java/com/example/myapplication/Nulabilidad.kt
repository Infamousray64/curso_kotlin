package com.example.myapplication

fun main(){
    var name: String? = null;
    println(name?.get(3) ?: "No hay nombre");

}