fun main () {
    println("Digite sua idade")
    val age = readln().toInt()

    when(age) {

        in 10..14 -> println("Infantil")
        in 15..17 -> println("Juvenil")
        in 18..25 -> println("Adultos")
        in 26..30 -> println("Sub corinthians")
        else -> println("Sem categoria")
    }


}

