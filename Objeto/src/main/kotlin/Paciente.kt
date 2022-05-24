class Paciente (var grau: Int, var situation: String, var cirurgico: Boolean,
                var internacao: Boolean, var saldoCliente: Double) {


}
fun inter (grau: Int) {
    println("Fale o valor da internação")
    var valor = readln().toDouble()
    println("Saldo do cliente")
    grau == readln().toInt()
    if (grau == 3) {
        println("INTERNAÇÃO IMEDIATA")
    } else if (grau == 2) {
        println("Internação requerida")

    } else if (grau == 1) {
        println("Não é necessario internação")
    }
    else {
        println("Escolha um numero de 1 a 3")
    }

}
