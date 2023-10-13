package sessao7.exerciciosEstruturaRepeticao

fun main() {
    ex2While()
}

fun ex1While() { //Em uma caixa d'água de 2 mil litros, quantos balões de água de 7 litros caberiam?
    val capCaixa = 2000
    val capBalao = 7

    var numBaloes = 0
    while ((numBaloes * capBalao) + capBalao < capCaixa) {
        numBaloes++
    }
    print("Cabem ${numBaloes} balões na caixa d'água.")
}

fun ex2While() { //Imprimir números de 1 a 50 em ordem crescente: Quando o número for divisível por 3 imprimir buzz, Quando o número for divisível por 5 imprimir fizz, Quando o número for divisível por 3 e por 5 imprimir fizbuzz
    var i = 1
    while (i <= 50) {
        if(i % 3 == 0 && i % 5 == 0) {
            println("${i} FizzBuzz")
        } else if(i % 3 == 0) {
            println("${i} Buzz")
        } else if(i % 5 == 0) {
            println("${i} Fizz")
        } else {
            println("${i}")
        }
        i++
    }
}