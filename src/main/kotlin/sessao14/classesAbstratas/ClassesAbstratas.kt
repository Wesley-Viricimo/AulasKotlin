package sessao14.classesAbstratas

interface Selvagem { //Quando uma classe interface é criada, é obrigatório que as classes que irão herdar esta implemente os métodos que não possuem corpo e não é possível realizar a instância de interfaces. A principal diferença para classes abstratas é que na interface as variáveis não contém valor
    fun atacar()
}


abstract class Mamifero(val nome: String)  { //Quando uma classe abstrata é criada, é obrigatório que as classes que irão herdar esta implemente os métodos abstratos e não é possível realizar a instância de classes abstratas
    fun acordar() {}
    fun dormir() {}

    abstract fun falar()
}

class Cachorro(nome: String) : Mamifero(nome), Selvagem {
    override fun falar() {
        TODO("Not yet implemented")
    }

    override fun atacar() {
        TODO("Not yet implemented")
    }

}

fun main() {

}