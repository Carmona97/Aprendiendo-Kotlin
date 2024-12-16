package nivel_maestro_jedi

import java.util.Scanner

/*
10. Realiza un programa que lea una secuencia de notas (con valores que van de 0 a 10) que
termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.

11. Realiza un programa que sume independientemente los pares y los impares de los números
comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas.

12. Realiza un programa que calcule el valor A elevado a B (A^B) sin hacer uso del operador de
potencia (^), siendo A y B valores introducidos por teclado, y luego muestre el resultado por
pantalla.

13. Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador intenta
adivinarlo. Es decir, el ordenador irá proponiendo números una y otra vez hasta adivinarlo.

14. Realiza un programa que dada una cantidad de euros que el usuario introduce por teclado
(múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para alcanzar dicha
cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que indicar el mínimo de
billetes posible. Por ejemplo, si el usuario introduce 145 el programa indicará que será necesario
1 billete de 100 €, 2 billetes de 20 € y 1 billete de 5 € (no será válido por ejemplo 29 billetes de
5, que aunque sume 145 € no es el mínimo número de billetes posible).
*/
fun main() {
    //nivel10()
    //nivel11()
    //nivel12()
    nivel13(100)
}


fun nivel10(){
    var isTen = false;
    var nota = 0;
    val scn = Scanner(System.`in`)
    do {
        println("Introduce tu nota. -1 para salir")
        nota = scn.nextInt();
        if(nota<-1 || nota > 10){
            println("Valor no valido")
        }else{
            when {
                nota == 10 -> isTen = true
            }
        }
    }while(nota != -1)

    when{
        isTen == true -> println("Se ha introducido un 10")
        isTen == false -> println("No ha habido 10")
    }
}

fun nivel11(){
    var sumaPares = 0;
    var sumaImpares = 0;
    for (i in 100..200){
        when{
            i%2 == 0 -> sumaPares += i;
            i%2 != 0 -> sumaImpares +=i;
        }
    }
    println("La suma de los pares es: $sumaPares.\nLa suma de los impares es: $sumaImpares.")
}

fun nivel12(){
    var base = 0
    var exponente = 0
    var resultado = 1.0
    var isExponenteNegativo = false
    val scn = Scanner(System.`in`)
    println("Introduce la base:")
    base = scn.nextInt()
    println("Introduce el exponente:")
    exponente = scn.nextInt()

    if (exponente<0){
        exponente = exponente * (-1)
        isExponenteNegativo = true
    }

    for (i in 1..exponente){

        resultado *= base

    }

    if(isExponenteNegativo){
        resultado = 1/resultado
    }
    println(resultado)
}

fun nivel13(numUsuario:Int) {
    var numAleatorio:Int? = null
    var intentos = 0
    while (numAleatorio != numUsuario){
        numAleatorio = (Math.random()*101).toInt()
        intentos++
    }
    println("El numero es $numAleatorio y se ha conseguido en $intentos intentos")
}
