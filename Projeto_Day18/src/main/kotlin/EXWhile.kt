fun main () {

    var id21 = 0
    var idade = 0
    var i50 = 0

    while (idade != -99)
    {
        println("Insira sua idade")
         idade = readln().toInt()
        if (idade <=21) {
            id21++
        }
        else if (idade >= 50) {
            i50++
        }



    }

    print("A qtd de pessoas com menos de 21 é $id21")
    println("A qtd de pessoas com mais de 50 anos é $i50")



}