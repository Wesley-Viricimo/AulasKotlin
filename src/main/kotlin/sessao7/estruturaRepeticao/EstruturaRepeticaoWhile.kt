package sessao7.estruturaRepeticao

fun main() {

    var i = 0
    while (i < 100) {
        print("$i ")
        i++
    }

    do {
        print("Informe seu nome: ")
        val value = readLine()
    } while ( value == "")
}