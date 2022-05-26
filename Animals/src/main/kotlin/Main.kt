fun main() {
    val bicho = Preguica("Jason", 3)
    bicho.acao()
    bicho.soltarSom()
    println(bicho)

    val fanfic = Cavalo("Ferrari", 23)
    println("\n")
    fanfic.acao()
    fanfic.soltarSom()
    println(fanfic)
}
