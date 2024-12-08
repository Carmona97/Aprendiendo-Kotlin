package nivel_padawan

import java.util.Scanner

//nivel1. Realiza un programa que muestre por pantalla los 20 primeros números naturales (1, 2, 3... 20).
//nivel2. Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200. Para ello utiliza un contador y suma de 2 en 2.
//nivel3. Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200. Esta vez utiliza un contador sumando de 1 en 1.
//nivel4. Realiza un programa que muestre los números desde el 1 hasta un número N que se introducirá por teclado.

fun main() {
    nivel1()
    nivel2()
    nivel3()
    nivel4()
}

fun nivel1() {
    for (i in 1..20) {
        println(i)
    }
}

fun nivel2() {
    for (i in 2..200 step 2) {
        println(i)
    }
}

fun nivel3() {
    for (i in 1..200) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}

fun nivel4() {
    val scn = Scanner(System.`in`)
    println("Introduce un numero para contar:")

    val num = scn.nextInt()
    for (i in 1..num) {
        println(i)
    }

}