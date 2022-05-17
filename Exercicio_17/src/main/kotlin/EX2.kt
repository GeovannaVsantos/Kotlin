fun main (){

    println("Digite o 1 numero da lista")
    val n1 = readln().toDouble()
    println("Segundo número")
    val n2 = readln().toDouble()
    println("Terceiro número")
    val n3 = readln().toDouble()

    if(n1>= n2 && n1>= n3 && n2>= n3)
    {
        println("A sequencia é\n $n1\n $n2\n $n3 ")
    }
    else if(n1>= n2 && n1>= n3 && n2<= n3)
    {
        println("A sequencia é \n $n1\n $n3\n $n2 ")
    }
    else if(n2>= n1 && n2>= n3 && n1>=n3)
    {
        println("A sequencia é\n $n2\n $n1\n $n3")
    }
    else if (n2>= n1 && n2>= n3 && n1<=n3)
    {
        println("A sequencia é\n $n2\n $n3\n $n1")
    }
    else if(n3>= n2 && n3>= n1 && n2>= n1)
    {
        println("A sequencia é\n $n3\n $n2\n $n1")
    }
    else if(n3>= n2 && n3>= n1 && n2<= n1)
    {
        println("A sequencia é\n $n3\n $n1\n $n2")
    }
}