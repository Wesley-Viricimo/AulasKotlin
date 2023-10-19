package sessao16.business

class ConviteBusiness {
    fun tipoValido(tipoConvite: String) : Boolean {
        return (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo")
    }

    fun codigoValido(codigoConvite: String, tipoConvite: String): Boolean {
        if (tipoConvite == "comum" && codigoConvite.startsWith("xt")) {
            return true
        } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codigoConvite.startsWith("xl")) {
            return true
        } else {
            return false
        }
    }
}