fun main(args: Array<String>) {

    val xogador = Xogador(6, "Eustaquio", "Fernandez", 17, 69, "Líbero")
    val adestrador = Adestrador(9, "Pablo", "Gonzalez", 21, "Aguador")
    val xogador2 : Seleccion = Xogador(7, "Elber", "Galarga", 69, 12, "Midlaner")

    println(xogador)
    println(xogador2)
    println(adestrador)
    xogador.xogarPartido()
    adestrador.dirixirAdestramento()
}