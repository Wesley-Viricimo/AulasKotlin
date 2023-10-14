package sessao11

fun main() {
    println(media(1f, 2f, 3f, 4f))
    println(mediaGenerics(false, 1f, 2f, false, ""))
}

fun media(vararg notas: Float) : Float { //Vararg permite que sejam enviados vários valores como parâmetro desde que possuam o mesmo tipo
    var soma = 0f

    for (n in notas) {
        soma += n
    }
    return (soma / notas.size)
}

fun <T, J> mediaGenerics(abc: J, vararg notas: T) : Float { //Função que utilizando generics, desta forma poderá ser passado como argumento valores de qualquer tipo e serão aceitos. VarArg sempre deve ser último parâmtro recebido
    var soma = 0f

    for (n in notas) {
        if (n is Float) { //Verifica se o valor de n é um float
            soma += n
        }
    }
    return (soma / notas.size)
}