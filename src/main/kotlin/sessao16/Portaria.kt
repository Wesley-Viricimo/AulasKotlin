package sessao16

class Portaria {

    private val console = Console()
     fun controle() {
        val idade = console.readInt("Qual a sua idade?")
         if (idade < 18) {
             println("Negado, Menores de idade não são permitidos!")
             return
         }

         val tipoConvite = console.readString("Qual é o tipo de convite?" )
         println(tipoConvite)
    }
}