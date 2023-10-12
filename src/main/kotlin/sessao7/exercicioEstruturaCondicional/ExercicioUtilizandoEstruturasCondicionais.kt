package sessao7.exercicioEstruturaCondicional

fun main() {
    val bonus = cargo("Gerente")
    println(bonus)

    val bonus2 = cargo("Gerente", 2);
    println(bonus2)

    val bonusWhen = bonusWhen("Estagiário");
    println(bonusWhen)
}

fun cargo(cargo: String): Float {
    var bonus = 0f
    if (cargo == "Gerente") {
        bonus = 2000f
    } else if (cargo == "Coordenador") {
        bonus = 1500f
    } else if (cargo == "Engenheiro de software") {
        bonus = 1000f
    } else if (cargo == "Estagiário") {
        bonus = 500f
    }
    return bonus
}

fun cargo(cargo: String, experiencia: Int): Float {
    var bonus = 0f
    if (cargo == "Gerente") {
        if (experiencia < 2) {
            bonus = 2000f
        } else {
            bonus = 3000f
        }
    } else if (cargo == "Coordenador") {
        if (experiencia < 2) {
            bonus = 1500f
        } else {
            bonus = 1800f
        }
    } else if (cargo == "Engenheiro de software") {
        bonus = 1000f
    } else if (cargo == "Estagiário") {
        bonus = 500f
    }
    return bonus
}

fun bonusWhen(cargo: String) : Float {
    /*var bonus = 0f;
    when (cargo) { //Operador when é similar ao switch
        "Gerente" -> bonus = 2000f
        "Coordenador" -> bonus = 1500f
        "Engenheiro de software" -> bonus = 1000f
        "Estagiário" -> bonus = 500f
    }
    return bonus*/

    val bonus = when(cargo) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de software" -> 1000f
        "Estagiário" -> 500f
        else -> 0f //Se o cargo não for nehum retornará 0
    }
    return bonus
}