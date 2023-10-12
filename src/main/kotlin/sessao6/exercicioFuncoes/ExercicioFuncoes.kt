package sessao6.exercicioFuncoes

fun main() {
    converteAnos(26)
    println("Quantidade de caracteres: ${caracteres("Wesley Viricimo")}")
    println("Cubo: ${cubo(3)}")
}

fun converteAnos(anos: Int) : Unit {
    println("$anos anos equivalem a:")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} segundos")
}

fun caracteres(str: String) : Int {
    return str.length
}

fun cubo(n: Int) : Int {
    return n * n * n
}