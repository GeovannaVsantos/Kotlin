class Cavalo  (override var nome:String,
               override var idade:Int) : Animal {
    override fun acao() {
        println("Cavalo: Sua função é correr")
    }

    override fun soltarSom() {
        println("Cavalo faz som: /Carro derrapando")
    }

    override fun toString(): String {
        return "Seu nome é $nome, a sua idade é $idade"
    }
}