package sessao11

fun main() {
    print(media(1f, 2f, 3f, 4f))
}

fun media(vararg notas: Float) : Float { //Vararg permite que sejam enviados vários valores como parâmetro desde que possuam o mesmo tipo
    var soma = 0f

    for (n in notas) {
        soma += n
    }
    return (soma / notas.size)
}