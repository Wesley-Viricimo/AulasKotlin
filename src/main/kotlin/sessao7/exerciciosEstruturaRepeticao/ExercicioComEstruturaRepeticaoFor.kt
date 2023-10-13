package sessao7.exerciciosEstruturaRepeticao

fun main() {
    ex3()
}

fun ex1() { //Exibir do 1 ao 50 em ordem crescente
    for (i in 1..50) {
        print("$i")
    }
}

fun ex2() { //Exibir do 1 ao 50 em ordem decrescente
    for (i in 50 downTo 1) {
        print("$i")
    }
}

fun ex3() { //Não exibir multiplos de 5
    for(i in 1..50) {
        if(i % 5 == 0) {
            continue //Se o valor de i dividido por 5 for igual a 0 significa que o valor é divisível por 5 e retornará para o inicio do laço
        }
        print("$i ")
    }
}