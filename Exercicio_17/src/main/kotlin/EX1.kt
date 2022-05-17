fun main () {

    //Receba tres inteiros e defina o maior
    println("Digite o valor 1")
    var n1 = readln().toDouble()
    println("Segundo número")
    var n2 = readln().toDouble()
    println("Terceiro número")
    var n3 = readln().toDouble()




    when(n1 >= n2 && n1>= n3 || n2>= n1 && n2>= n3 ||n3>= n1 && n3>= n2 ) {
      n1 >= n2 && n1 >= n3 -> println("$n1 é o maior")
        n2>= n1 && n2>= n3 -> println("$n2 é o maior")
        n3>= n1 && n3>= n2 -> println("$n3 é o maior")

    }
}

