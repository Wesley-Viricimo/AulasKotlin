package sessao7.estruturaRepeticao

fun main() {

    var i = 0
    while (i < 80) {
        /*if(i == 50) { //Quando i for igual a 50 a execução será interrompida
            break
        }*/

        if(i < 50) {
            i++
            continue
        }



        println("$i")
        i++
    }
}