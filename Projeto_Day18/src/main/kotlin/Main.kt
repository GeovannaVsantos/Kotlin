fun main () {

    println("Quer que o programa comece?")
    val resp = readln()


    for (b in 1000..1999) {

        val resultado = b
        if (resultado%11==5) {
            println("Os números são\n$b ")
        }

    }
}