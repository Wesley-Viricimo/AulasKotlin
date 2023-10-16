package sessao14.heranca

open class Eletronico(private var marca: String) { //Para que outras classes possam herdar desta é necessário indicar que é uma classe aberta
   private fun corrente(ativo: Boolean){}//Método não será enxergue fora da classe
    fun ligar() {
        corrente(true)
    }
    open fun desligar() {
        corrente(false)
    }
}

class Computador(marca: String) : Eletronico(marca) { //Herdando da classe Eletronico
    fun save() {

    }

    /*Como já existe um método com nome desligar na classe pai, porém não se comporta da forma que preciso
    sobrescrevi com override o método desligar
    */
    override fun desligar() {
        save()
        super.desligar() //Super serve para ser chamado o método desligar da classe pai
    }
}

fun main() {
    var c : Computador = Computador("Dell")

    c.ligar()
    c.desligar()
    //c.corrente()
    //c.marca
}