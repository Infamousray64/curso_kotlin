package com.example.myapplication
//variable de clase fuera de funciones pueden ser utilizadas por todos

var ejemploVariable: String = "Hola mundo";

/* Variables y valores */
//instanciar una variable se refiere a crear una variable y asignarle un valor
// camel case, las variables empiezan en minuscula si son palabras seguidas, la segubnda palabra empieza con mayuscula
fun main() {
    showMyName()
    showMyAge(50)
    add(5, 10);
    val mySubtract = subtract(10, 5);
    println(mySubtract);
}

fun showMyName() {
    println("me llamo ");
}

fun showMyAge(currentAge:Int) {
    println("Tengo $currentAge años");
}

fun add(firstNumber:Int, secondNumber:Int) {
    println(firstNumber + secondNumber);
}

fun subtract(firstNumber:Int, secondNumber:Int): Int{
    return(firstNumber - secondNumber); //return es el valor que se va a retornar, al llegar a este punto en el codigo de ahi en adelante ignora lo que hay
    println("esto no se va a imprimir");
}

fun variablesBoolean() {
    /* Variables booleanas */

    //boolean true o false
    val booleanExample: Boolean = true;
    val booleanExample2: Boolean = false;
}

fun variablesNumericas() {
    /* Variables numericas */

    //int -2147483648 a 2147483647
    val intExample: Int = 25;
    var intExample2: Int = 30;
    intExample2 = 40;

    //long -9223372036854775808 a 9223372036854775807
    val longExample: Long = 1234567890;

    //float decimal -3.4028235E38 a 3.4028235E38
    val floatExample: Float = 3.14f;

    //double decimal -1.7976931348623157E308 a 1.7976931348623157E308
    val doubleExample: Double = 3.1416;

}

fun variablesAlfanum() {

    //variables dentro de funciones solo pueden ser utilizadas por la funcion
    /* variables alfanumericas */

    //char un solo caracter soporta solo un caracter
    val charExample: Char = 'a';
    val charExample2: Char = '2';
    val charExample3: Char = '*';

    //String cadena de caracteres sirve para lo que sea
    val stringExample: String = "Ramon";


    //usar el signo $ para concatenar variables referenciando la variable
    var stringConcatenado: String = "hola";
    stringConcatenado = "hola me llamo $stringExample;";
    println(stringConcatenado)
}