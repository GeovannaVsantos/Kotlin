fun main (){

    var soma = 0
    var conN = 0
    var media = 0
    val escape = 0

    do {
        println("Insira um número")
        var num = readln().toInt()
        if (num %3 == 0 && num != 0 )
        {
            conN++
            soma = num + num

        }
        else if (num %3 != 0 ) {
          println("$num não é divisor por 3")
            conN--
        }



    } while (num != 0)



    media = soma / conN++

    print("O calculo é $media ")



}