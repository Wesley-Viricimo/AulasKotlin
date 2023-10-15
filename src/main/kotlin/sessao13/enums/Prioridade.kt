package sessao13.enums

enum class Prioridade(val value: Int) { //Enumeradores delimitam o intervalo de valores em sua instância
    Baixa(1), Media(2), Alta(3)
}

enum class AnimalEnum {
    Cachorro, Gato, Cavalo, Vaca
}

fun x(p: Prioridade) {

}

fun main() {
    x(Prioridade.Baixa)
}