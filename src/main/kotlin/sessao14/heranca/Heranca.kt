package sessao14.heranca

open class Eletronico(private var marca: String) { //Para que outras classes possam herdar desta é necessário indicar que é uma classe aberta
   private fun ativarCorrente(){}//Método não será enxergue fora da classe
    fun ligar() {
        ativarCorrente()
    }
    fun desligar() {}
}

class Computador(marca: String) : Eletronico(marca) { //Herdando da classe Eletronico

}

fun main() {
    var c : Computador = Computador("Dell")

    c.ligar()
    c.desligar()
    //c.ativarCorrente()
    //c.marca
}