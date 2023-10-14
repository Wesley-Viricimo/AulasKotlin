package sessao11

fun main() {
    valores("teste")
    valores(12f)
}

fun valores(values : Any) { //Parâmetro definido como tipo n pode receber qualquer tipo de valor
    print(values)
}

fun valoresUnit(values : Any) : Unit { //Funções do tipo unit não tem um retorno
    print(values)
}

fun valoresNothing(values : Any) : Nothing { //Funções do tipo nothing serve para disparar exceções
    TODO("NÃO IMPLEMENTADO")
}