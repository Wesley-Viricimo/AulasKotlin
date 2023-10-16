package sessao14.classesAbstratas

abstract class Mamifero(val nome: String) { //Quando uma classe abstrata é criada, é obrigatório que as classes que irão herdar esta implemente os métodos abstratos e não é possível realizar a instância de classes abstratas
    fun acordar() {}
    fun dormir() {}

    abstract fun falar()
}

class Cachorro(nome: String) : Mamifero(nome) {
    override fun falar() {
        TODO("Not yet implemented")
    }

}

fun main() {

}