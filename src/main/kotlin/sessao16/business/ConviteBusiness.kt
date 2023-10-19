package sessao16.business

import sessao16.entity.Convite

class ConviteBusiness {
    /*fun tipoValido(tipoConvite: String) : Boolean {
        return (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo")
    }*/

    //Função acima fará a mesma coisa
    fun tipoValido(tipoConvite: String) = (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo")

   /* fun teste1(convite: Convite): Boolean {
        return when (convite.tipo) {
            "comum" -> {
                return convite.codigo.startsWith("xt")
            }
            "primium", "luxo" -> {
                return convite.codigo.startsWith("xl")
            }
            else -> {
                return false
            }
        }
    }*/

    //Função acima fará a mesma coisa
    fun codigoValido(convite: Convite) = when(convite.tipo) {
        "comum" -> convite.codigo.startsWith("xt")
        "premium", "luxo" -> convite.codigo.startsWith("xl")
        else -> false
    }
}