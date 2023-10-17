package sessao15.colecoes

fun main() {
    val list : List<Int> = listOf(1,2,3,4,5) //Na lista do kotlin não é possível que seja adicionado valores
    val list2 : MutableList<Int> = mutableListOf(1,2,3,4,5) //Na mutableList é possível adicionar valores

    val set1 : Set<String> = setOf<String>() //Coleções do tipo set não permite valores duplicados, não irá dar erro porém não irá duplicar e também não permite que sejam adicionados valores
    val set2 : MutableSet<String> = mutableSetOf<String>()

    val map1 = mapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"))
    val map2 = mutableMapOf<String, String>()

    println(map1.entries) //Chaves e valores
    println(map1.keys)    //Chaves
    println(map1.values)  //Valores

    map2.put("Brasil", "Brasilia")
    map2.put("Angola", "Moçambique")

    println(map2.entries) //Chaves e valores
    println(map2.keys)    //Chaves
    println(map2.values)  //Valores




}