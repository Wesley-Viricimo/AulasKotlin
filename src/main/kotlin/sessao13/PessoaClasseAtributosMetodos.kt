package sessao13

class PessoaClassesAtributosMetodos(var anoNascimento: Int, var nome: String) { //Precisa ser declarado o var para o atributo ser acessado fora da classe
    var doc: String? = null
    constructor(anoNascimento: Int, nome: String, doc: String) : this(anoNascimento, nome) {
        this.doc = doc
    }

    fun dormir() {

    }

    fun acordar() {

    }
}

fun main() {
    //Instância do objeto pessoa
    var pessoa: PessoaClassesAtributosMetodos = PessoaClassesAtributosMetodos(1997, "Wesley", "2112345")

    println(pessoa.nome)
    println(pessoa.anoNascimento)

    pessoa.dormir()
    pessoa.acordar()
    pessoa.doc

}