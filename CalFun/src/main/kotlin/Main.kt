fun main() {



    print("Insira o primeiro numero: ")
    var num1 = readln().toInt()
    print("Insira o segundo numero: ")
    var num2 = readln().toInt()

    println("A soma é ${soma(num1, num2)}")
    println("A subtração é ${sub(num1, num2)}")
    println("A divisão é ${div(num1, num2)}")
    println("A multiplicação é ${multi(num1, num2)}")

}

fun soma(n1:Int, n2:Int): Int {
    return n1 + n2
}
fun sub(nS1: Int, nS2: Int): Int {
    return nS1 - nS2
}
fun div(nD1:Int,nD2:Int): Int {
    return nD1 / nD2
}
fun multi(nM1:Int, nM2:Int): Int {
    return nM1 * nM2
}

