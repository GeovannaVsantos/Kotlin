class Client (var nome: String, var telefone: String) {

    var endereco = ""
    val compra = mutableListOf<String>()
    var id = mutableListOf<String>()
    var produ = ""


    constructor(nome: String, telefone: String,endereco: String, produ:String) : this(nome, telefone) {
        this.endereco = endereco
        this.produ = produ
    }
    fun add () {
        while (true) {
            println("Acrescente seus produtos")
            var prod = readln()

            if (prod!= "" && prod != "Mudar") {
                compra.add(prod)
                println("Produto feito com sucesso")
                compra.forEach { println(it) }
            } else if (prod == "Mudar"){
                remover()
            }
            else {
                break
            }
        }

    }

    fun remover () {
        while (true) {
            println("Quais são os produtos que quer remover?")
            var remo = readln()
            if(compra.contains(remo) && remo != "Finalizar") {
                compra.remove(remo)
                compra.forEach { println(it) }
            } else if (remo == "Finalizar") {
                break
            } else {
                println("Não existe na lista")
            }

        }
        }
    }









