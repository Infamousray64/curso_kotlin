package com.example.myapplication.exercises

/*
En el código inicial que se proporciona en el siguiente fragmento de código,
escribe un programa que imprima el mensaje de resumen según la cantidad de
notificaciones que recibiste. El mensaje debe incluir lo siguiente:

Resultado:
- La cantidad exacta de notificaciones cuando haya menos de 100
- 99+ como cantidad de notificaciones cuando haya 100 o más
*/

fun main() {
    val morningNotification = 51
    val eveningNotification = 101

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

/*fun printNotificationSummary(numberOfMessages: Int) {
    // Fill in the code.
    if (numberOfMessages < 100) {
        println("Tienes $numberOfMessages notificaciones")
    } else {
        println("Tienes 99+ notificaciones")
    }
} */

 // tambien puede ser asi

fun printNotificationSummary(numberOfMessages: Int) {
    // Fill in the code.
    if (numberOfMessages <= 100) {
        println("Tienes $numberOfMessages notificaciones")
    } else {
        println("Tienes +99 notificaciones")
    }
}