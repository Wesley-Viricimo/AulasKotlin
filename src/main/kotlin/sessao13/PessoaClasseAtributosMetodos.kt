package sessao13

class PessoaClassesAtributosMetodos(var anoNascimento: Int, var nome: String) { //Precisa ser declarado o var para o atributo ser acessado fora da classe
    fun dormir() {

    }

    fun acordar() {

    }
}

fun main() {
    //Instância do objeto pessoa
    var pessoa: PessoaClassesAtributosMetodos = PessoaClassesAtributosMetodos(1997, "Wesley")

    println(pessoa.nome)
    println(pessoa.anoNascimento)

    pessoa.dormir()
    pessoa.acordar()

}