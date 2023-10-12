package sessao7.estruturaCondicional

fun main() {
    maiorIdade(15)
    print(saudacao(true))
}

fun maiorIdade(idade: Int) : Unit {
    if(idade > 18) {
        println("Maior idade")
    } else {
        println("Menor idade")
    }
}

fun saudacao(dia: Boolean) : String {
    return if (dia) {
        "Bom dia"
    } else {
        "Boa Noite"
    }
}