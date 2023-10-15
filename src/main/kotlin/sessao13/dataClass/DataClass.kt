package sessao13.dataClass

fun main() {
    val f1: Forma = Forma(10, 5)
    val f2: Forma = Forma(10, 5)
    println(f1.equals(f2)) //Compara endereço de memória
    println(f1.toString())
    println(f1.hashCode())
    println("-----------------")
    println(f2.toString())
    println(f2.hashCode())
    println("-----------------") 

    val f1DataClass: FormaData = FormaData(10, 5)
    val f2DataClass: FormaData = FormaData(10, 5)

    println(f1DataClass.equals(f2DataClass)) //Compara valores do objeto
    println(f1DataClass.toString())
    println(f1DataClass.hashCode())
    println("-----------------")
    println(f2DataClass.toString())
    println(f2DataClass.hashCode())
}

class Forma(val a: Int, val b: Int) {
    override fun equals(other: Any?): Boolean {
        return if(other is Forma) {
            (other.a == this.a && other.b == this.b)
        } else {
            return false
        }
    }
}

data class FormaData(val a: Int, val b: Int)