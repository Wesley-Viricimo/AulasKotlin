package sessao6.Funcoes

fun main() {
    helloWorld()
    println("A soma entre 3 e 4 é ${soma(3, 4)}")
    println("A Multiplicação entre 3 e 4 é ${mult(3, 4)}")
}

fun soma(a: Int, b: Int) : Int {
    return a + b;
}

fun mult(a: Int, b: Int) : Int = (a * b) //Função utilizando linha única

fun helloWorld() : Unit { //Função do tipo Unit não retorna nada, similar a void
     println("Olá mundo!")
}