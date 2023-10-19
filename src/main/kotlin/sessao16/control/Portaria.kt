package sessao16.control

import sessao16.control.Console

class Portaria {

    init {
        println("Portaria inicializada.")
        controle()
        println(controle())
    }
     private fun controle() : String {
        val idade = Console.readInt("Qual a sua idade?")
         if (idade < 18) {
             return "Negado, Menores de idade não são permitidos!"
         }

         val tipoConvite = Console.readString("Qual é o tipo de convite?" )
         println(tipoConvite)

         return "TODO!"
    }
}