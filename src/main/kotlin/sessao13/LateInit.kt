package sessao13

class Receita {
    lateinit var instrucoes: String //lateinit indica que variável não será inicializada em sua intância, mas em algum momento será

    fun geraReceita() {
        instrucoes = "Lave as mãos"
    }

    fun imprimeReceita() {
        if (!this::instrucoes.isInitialized) { //Verifica se a variável foi inicializada

        }
    }
}


fun main() {
    var r: Receita = Receita()
    r.imprimeReceita()
    println(r.instrucoes)
}

