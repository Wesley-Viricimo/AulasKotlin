package sessao15.anyCount

fun main() {
    val data = gerarDados()

    //data.any() -> Retorna true se a coleção tiver ao menos um elemento
    //data.count() -> Retorna a quantidade de elementos na coleção

    println("Tenho dados? ${if(data.any()) "Sim" else "Não"}")
    println("Tenho  ${data.count()} elementos")
}

fun gerarDados(): List<Receita> {
    return listOf(
        Receita("Lasanha", 1200,
            listOf(Ingredientes("Presunto", 5),
                   Ingredientes("Queijo", 5),
                   Ingredientes("Molho de tomate", 1),
                   Ingredientes("Manjericão", 10)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingredientes("Pão", 1),
                Ingredientes("Hamburguer", 3),
                Ingredientes("Queijo", 1),
                Ingredientes("Catupiry", 1),
                Ingredientes("Bacon", 3),
                Ingredientes("Alface", 1),
                Ingredientes("Tomate", 1)
            )
        )
    )
}

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingredientes> = listOf())

data class Ingredientes(val nome: String, val quantidade: Int)