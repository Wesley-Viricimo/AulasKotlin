package sessao8

fun main() {
    try {
        val s: String? = null
        println(s!!.length)
    } catch (e: NullPointerException) {
        println("Variável nula")
    } finally {
        print("Executou")
    }


}