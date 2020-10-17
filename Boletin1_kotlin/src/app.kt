fun main(){
    println("Hellow World")
    otrafuncion()
    println(sum(2,3))
    printSum(2,4)
    val empleado = Personas("Pepe","Grillo", 33)
    println(empleado.firstName)
    val micoche = Coches("Opel",6)
    println(micoche.marca)
}

fun otrafuncion(){
    println("Adios")
}

fun sum (a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}
fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}