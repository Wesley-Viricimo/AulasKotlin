package sessao7.exercicioEstruturaCondicional

fun main() {
    portaria()
}

fun quadrado(): Unit {
    print("Informe o lado 1: ")
    val lado1 = readLine()

    print("Informe o lado 2: ")
    val lado2 = readLine()

    print("Informe o lado 3: ")
    val lado3 = readLine()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "" && lado3 != null && lado3 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()
        val z = lado3.toInt()

        if (x == y && y == z) {
            println("É um triângulo equilátero")
        } else {
            println("Não é um triângulo equilátero")
        }
    }
}

fun portaria(): Unit {
    println("Informe sua idade: ")
    val idade = readLine()

    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Rejeitado, menores de idade não são permitidos.")
            return
        }
    }

    print("Qual é o tipo de convite? ")
    var tipoConvite = readLine()

    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()

        if (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo") {
            print("Qual o código do convite? ")
            var codigoConvite = readLine()
            if (codigoConvite != null && codigoConvite != "") {
                codigoConvite = codigoConvite.lowercase()
                if (tipoConvite == "comum" && codigoConvite.startsWith("xt")) {
                    println("Bem vindo!")
                } else if (tipoConvite == "premium" || tipoConvite == "luxo" && codigoConvite.startsWith("xl")) {
                    println("Bem vindo!")
                } else {
                    println("Negado, convite inválido")
                }
            }

        } else {
            println("Negado, convite inválido")
            return
        }
    }
}