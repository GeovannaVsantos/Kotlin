fun main() {


    val produtos = mutableListOf("Frutas", "Café da manhã", "Carnes", "Padaria")
    while (true) {
        println("Bem vindo a NateStore, o que deseja fazer?")
        println(
            "Opção 1 - Listagem dos corredores, Opção 2 - Alteração, Opção 3 - remover," +
                    "Opção 4 - Adicionar"
        )

        var funcao = readln().toInt()

        when (funcao) {

            1 -> {
                    println(produtos)
            }
            2 -> {
                println("Insira o corredor que quer alterar")
                var edit = readln()
                while (edit != "")
                if (produtos.contains(edit)) {
                    val index = produtos.indexOf(edit)
                    println("Digite o valor desejado")
                    val newname = readln()
                    produtos[index] = newname
                    println("Corredor $newname adicionado com sucesso")
                }
                  else {
                    println("Nome não encontrado")
                    break

                }
            }
            3 -> {
                println("Qual corredor deseja excluir?")
                var excluir = readln()
                if (produtos.contains(excluir)) {
                    produtos.remove(excluir)
                } else {
                    println("O corredor $excluir não existe")
                }
            }
            4 -> {
                while (true) {
                    println("Qual corredor quer adiconar?")
                    var newcorr = readln()
                    if (newcorr != "") {
                        produtos.add(newcorr)
                        println(produtos)
                    } else {
                        println("Impossivel adicionar corredor")
                        break
                    }



                }
            }
            else -> {
                println("Retornando ao menu inicial")

            }

        }

        println("Obrigado")
        break
    }
}



