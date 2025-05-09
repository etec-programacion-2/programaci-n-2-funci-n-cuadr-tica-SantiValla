
package org.example


fun main() {
    
    val a: Int = 2
    val b: Int = 4
    val c: Int = 6
    if (a==0) {
        println("justo ese valor de a no")
    } else {
        println("se va a hacer la siguiente funcion: $a x² + $b x + $c")
        fx(a, b ,c)
    }
}
fun fx(a: Int, b: Int, c: Int) {
    for (x in -5..5) {
        var cuadr = a*x*x+b*x+c
        println("el valor de y en x=$x es $cuadr") 
    }
}

