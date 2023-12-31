package sessao16.control

import sessao16.business.ConviteBusiness
import sessao16.control.Console
import sessao16.entity.Convite

class Portaria {

    private val conviteBusiness = ConviteBusiness()

    init {
        println("Portaria inicializada.")
        controle()
        println(controle())
    }
    fun controle() : String {
        val idade = Console.readInt("Qual a sua idade?")
         if (idade < 18) {
             return "Negado, Menores de idade não são permitidos!"
         }

         val tipoConvite = Console.readString("Qual é o tipo de convite?" )
         if (!conviteBusiness.tipoValido(tipoConvite)) {
             return "Negado, Convite inválido!"
         }

         val codigoConvite = Console.readString("Qual é o código do convite?" )
         val convite = Convite(tipoConvite, codigoConvite)
         if (!conviteBusiness.codigoValido(convite)) {
             return "Negado, Convite inválido!"
         }

         return "Bem vindo!"
    }
}