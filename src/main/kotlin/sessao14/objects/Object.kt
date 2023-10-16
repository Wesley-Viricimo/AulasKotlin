package sessao14.objects

class Matematica {
    companion object NOME { //Dentro do companion object são escritas variáveis e funções estáticas
        val PI = 3.1415
        fun teste() {}

        init {
            print("Companion iniciado")
        }
    }

    object obj1 {
        val PI = 3.1415
        fun teste() {}
    }
}

fun main() {
    Matematica.PI
    Matematica.teste()

    Matematica.obj1.PI
    Matematica.obj1.teste()

    val m = Matematica
    m.PI
}