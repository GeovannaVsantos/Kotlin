class Cachorro (override var nome:String,
                override var idade:Int) : Animal {
    override fun acao() {
        println("Cachorro: Sua função é correr")
    }

    override fun soltarSom() {
        println("Cachorro faz som: AUAU")
    }

    override fun toString(): String {
        return "Seu nome é $nome, sua idade é $idade"
    }
}