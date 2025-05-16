
package org.example

// funcion principal
fun main() {
    
    val a: Double = 2.0
    val b: Double = -4.0
    val c: Double = 1.0
    if (a==0.0) {
        println("justo ese valor de a no")
    } else {
        println("se va a hacer la siguiente funcion: $a x² + $b x + $c")
        fx(a, b ,c)
        raices(a, b ,c)
    }
}
// funcion que calcula el valor de la funcion cuadratica ax² + bx + c
fun fx(a: Double, b: Double, c: Double) {
    for (x in -5..5) {
        var cuadr: Double = a*x*x+b*x+c
        println("el valor de y en x=$x es $cuadr") 
    }
}
// funcion que calcula las raices de la funcion cuadratica
fun raices(a: Double, b: Double, c: Double) {
    val x1: Double = (-b+ Math.sqrt(b*b-4*a*c)) / (2*a)
    val x2: Double = (-b- Math.sqrt(b*b-4*a*c)) / (2*a)
    println("raices: x1= ${"%.2f".format(x1)}, x2=${"%.2f".format(x2)} ") 
    if ((b*b-4*a*c)>0.0) {
        println("la ecuacion tiene dos raices reales y distintas")
    } else if ((b*b-4*a*c)==0.0) {
        println("la ecuacion tiene una raiz real doble")
    } else {
        println("la ecuacion no tiene raices reales")
    }
}
