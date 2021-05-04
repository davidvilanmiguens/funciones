class Adestrador : Seleccion {

    var idFederacion:String="0a"

    constructor(id: Int, nome: String, apelido: String, edade: Int, idFederacion: String) : super(
        id,
        nome,
        apelido,
        edade
    ) {
        this.idFederacion = idFederacion
    }
    fun dirixirPartido():Unit{
        println("DIRIXE")
    }
    fun dirixirAdestramento():Unit{
        println("DIRIXE_2")
    }
    override fun concentrarse(tiempoConcentracion: Int): String {
        return "Concentrase a seleccion durante $tiempoConcentracion minutos"
    }
    override fun viaxar(pais: String): String {
        return  "Viaxan os xogadores ... $pais"
    }
    override fun toString(): String {
        return super.toString()+", idFederacion='$idFederacion'"
    }
}