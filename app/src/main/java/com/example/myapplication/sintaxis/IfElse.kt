package com.example.myapplication.sintaxis

fun main() {
    ifBasico()
    ifAnidado()
    ifBoolean()
    ifInt()
    ifMultiple()
    ifMultipleOR()
}

fun ifMultipleOR() { // or es || y sirve para evaluar si una o mas condiciones son verdaderas
    var pet = "cat";
    var isHappy = true;

    if(pet == "dog" || (pet == "cat" && isHappy)){
        println("Es un gato o un perro");
    }
}

fun ifMultiple() {
    var age = 18;
    var parentPermission = false;
    var imHappy = true;
    if(age >= 18 && !parentPermission && imHappy){ // && es and y sirve para evaluar si todas las condiciones son verdaderas
        println("Puedes beber");
    }
}

fun ifInt() {
    var edad = 18;
    if(edad >= 18){
        println("Eres mayor de edad");
    }else{
        println("Eres menor de edad");
    }
}

fun ifBoolean() {
    var soyFeliz:Boolean = false;

    //sin nada es igual a true
    //con exclamacion es igual a false

    if(!soyFeliz){
        println("estoy triste :(");

    }
}

fun ifAnidado() { //no es una buena practica usar if anidados
    val animal = "toro";
    if (animal == "dog") {
        println("es un perro");
    } else if (animal == "cat") {
        println("es un gato");
    } else if (animal == "bird") {
        println("es un pajaro");
    } else {
        println("no se que animal es");
    }
}

fun ifBasico() {
    /* If basico */
    //if es una estructura de control que permite evaluar una condicion
    //si la condicion es verdadera ejecuta el bloque de codigo dentro del if
    //si la condicion es falsa no ejecuta el bloque de codigo dentro del if
    val name = "pablo";
    if (name == "ramon") {
        println("la variable name es ramon");
    } else {
        println("la variable name no es ramon");
    }

}