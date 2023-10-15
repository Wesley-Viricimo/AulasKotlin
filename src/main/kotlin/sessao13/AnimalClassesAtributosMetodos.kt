package sessao13

class Animal(var especie: String) {

    var fala: String = ""

    init { //Init sempre é executado na instância da classe
        fala = if (especie == "cachorro") {
            "auau"
        } else if (especie == "gato") {
            "miau"
        } else {
            "Nenhuma fala"
        }

        println("sdf")
        println(fala)
    }
}

fun main() {
    Animal("cachorro")
}