package sessao14.polimorfismo

interface Funcionario {
    var salario: Float
    fun bonus(): Float
}

class Gerente(override var salario: Float) : Funcionario { //Classe irá receber o salário como argumento, precisa do override para identificar que é a mesma variável da classe pai
    override fun bonus(): Float { //Sobrescrevendo método da classe pai
        return salario * 0.5f
    }
}

class Analista(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.3f
    }
}

fun mostraBonus(func: Funcionario) { //Função irá receber um funcionário, seja ele Gerente ou analista e retornar o bonus
    println(func.bonus())
}

fun main() {
    mostraBonus(Gerente(5000f))
    mostraBonus(Analista(4000f))
}