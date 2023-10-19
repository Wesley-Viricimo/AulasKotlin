package sessao16.control

import sessao16.business.ConviteBusiness
import sessao16.control.Console

class Portaria {

    private val conviteBusiness = ConviteBusiness()

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
         if (!conviteBusiness.tipoValido(tipoConvite)) {
             return "Negado, Convite inválido!"
         }

         val codigoConvite = Console.readString("Qual é o código do convite?" )
         if (!conviteBusiness.codigoValido(codigoConvite, tipoConvite)) {
             return "Negado, Convite inválido!"
         }

         return "TODO!"
    }
}