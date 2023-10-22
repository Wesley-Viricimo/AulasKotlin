package sessao23

//Lambda é uma função anônima que pode ser passada como argumento
fun main() {
    val a = { println("Hello") }
    a()
    receiveA(a)

    val b = { x: Int -> x * x }
    b(10)
    receiveB(b)

    val c = { x: Int, y: Int ->
        println("Executando")
        x * y //Ultima linha da lambda faz o tipo de retorno
    }
    receiveC(c)
}


fun receiveA(lambda: () -> Unit) { //Recebendo uma função como parâmetro
    lambda()
}

fun receiveB(lambda: (x: Int) -> Int) {}

fun receiveC(lambda: (b1: Int, b2: Int) -> Int) {

}