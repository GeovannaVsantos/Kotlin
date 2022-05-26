data class  Preguica(override var nome:String,
                        override var idade:Int ) : Animal {

    override fun acao() {
        println("Preguiça:Seu deslocamento é Subir na arvore")

    }

    override fun soltarSom() {
        println("Seu som é AAAaaaaaAaAaAaAa")
    }

    override fun toString(): String {
        return "Seu nome é $nome, sua idade é $idade"
    }
}


