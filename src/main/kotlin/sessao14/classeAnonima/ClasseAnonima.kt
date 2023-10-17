package sessao14.classeAnonima

interface Event {
    fun onSuccess()
}

class Programa {
    fun salvar(e: Event) {
        println("Abrindo conexões.")
        println("Salvando valores.")
        println("Sucesso. Conexões fechadas.")
        e.onSuccess()
    }
}

fun main() {
    val p = Programa()
    p.salvar(object : Event { //Chamada para classe anônima que será executada somente no escopo da função e depois deixará de existir
        override fun onSuccess() {
            print("onSucess")
        }
    })
}