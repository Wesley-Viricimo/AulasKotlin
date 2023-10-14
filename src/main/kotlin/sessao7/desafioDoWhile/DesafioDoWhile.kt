package sessao7.desafioDoWhile

fun main() {
    val salario = 10000f
    var patrimonioAna = 0f
    var patrimonioPaula = 0f
    var mes = 0

    do {
        patrimonioAna += (salario * 0.05f) + (salario * 0.05f) + (patrimonioAna * 0.002f)
        patrimonioPaula += (salario * 0.5f) + (patrimonioPaula * 0.008f)
        mes++
    } while (patrimonioAna > patrimonioPaula)

    print("Paula irá utrapassar o patrimônio de Ana em ${mes} meses")
}