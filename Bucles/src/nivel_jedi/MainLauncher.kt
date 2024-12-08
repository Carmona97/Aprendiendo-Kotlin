package nivel_jedi

import java.util.Scanner

/*
Nivel 5. Realiza un programa que lea un número positivo N y calcule y visualice su factorial N!
Siendo el factorial:
1! = 1
2! = 2 * 1
3! = 3 * 2 * 1
N! = N * (N-1) * (N-2)........* 3*2*1

Nivel 6. Realiza un programa que lea 5 números y luego muestre los numeros que se han introducido.

Nivel 7. Realiza un programa que lea 5 números y luego muestre un mensaje indicando
cuántos son positivos y cuantos negativos.

Nivel 8. Realiza un programa que lea una secuencia de números hasta que se introduzca un 0, y
luego muestre cuantos positivos y cuantos negativos se han leido.

Nivel 9. Realiza un programa que calcule y escriba la suma y el producto de los 10 primeros números
naturales.*/
fun main() {
    //nivel5()
    //nivel6()
    //nivel7()
    //nivel8()
    nivel9()
}



fun nivel5(){
    val scn = Scanner(System.`in`)
    var num = 0
    var factorial = 1;
    print("Introduce un numero positivo")
    do {
        num = scn.nextInt()
        if (num<=0){
            println("El número debe ser mayor que 0")
        }
    }while (num<=0)

    for (i in 1..num){
        factorial = i*factorial
    }
    println(factorial)
}

fun nivel6(){
    val scn = Scanner(System.`in`)
    val numsIntroducidos = IntArray(5)
    var numIntroducido = 0
    for (i in 0..numsIntroducidos.size - 1) {

        if (i!=0) {
            print("Introduzca otro, quedan " + (numsIntroducidos.size - i))
            numIntroducido = scn.nextInt()
            numsIntroducidos.set(i, numIntroducido)
        }else {
            println("Introduzca un numero")
            numIntroducido = scn.nextInt()
            numsIntroducidos.set(i, numIntroducido)
        }

    }
    for (i in 0..numsIntroducidos.size-1) {
        println("El numero introducido en la posicion "+i+" es "+numsIntroducidos[i])
    }
}
fun nivel7() {
    val scn = Scanner(System.`in`)
    var positivos=0
    var negativos=0
    var numIntroducido = 0

    for(i in 1..5)
    {
        println("Introduzca un numero")
        numIntroducido = scn.nextInt()
        if (numIntroducido>0)
        {
            positivos++
        }else if (numIntroducido<0){
            negativos++
        }else{
            println("El 0 no es un numero válido y no se tendrá en cuenta")
        }
    }
    println("Se han introducido "+positivos+" numeros positivos y "+negativos+" numeros negativos")
}
fun nivel8() {
    val scn = Scanner(System.`in`)
    var positivos=0
    var negativos=0
    var numIntroducido = 0

    do {
        println("Introduzca un numero")
        numIntroducido = scn.nextInt()

        when{
            numIntroducido>0 -> positivos++
            numIntroducido<0 -> negativos++
        }

    }while (numIntroducido!=0)

    println("Se han introducido $positivos numeros positivos y $negativos numeros negativos")
}
fun nivel9(){
    println(calcularSuma())
    println(calcularProducto())
}
fun calcularSuma():String{
    var suma = 0
    for (i in 1..10){
        suma += i
    }
    return "La suma es $suma"
}
fun calcularProducto():String{
    var producto = 1
    for (i in 1..10){
        producto *= i
    }
    return "El producto es $producto"
}