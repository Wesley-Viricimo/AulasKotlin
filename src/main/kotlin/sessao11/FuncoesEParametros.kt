package sessao11

fun main() {
    endereco("Hermínio Cavalari", "Marília", "SP", "17526-100", 33 )
    endereco(cidade = "Marília", rua = "Hermínio Cavalari", estado = "SP", cep = "17526-100") //Argumentos podem ser informados na em outra ordem
}

fun endereco(rua: String, cidade: String, estado: String, cep: String = "", numero: Int = 0) { //Parâmetro está com valor default, caso usuário não informe
}