class Xogador : Seleccion{

    var dorsal:Int=0
    var demarcacion:String="Jugador"


    constructor(id: Int, nome: String, apelido: String, edade: Int, dorsal: Int, demarcacion: String) : super(
        id,
        nome,
        apelido,
        edade
    ) {
        this.dorsal = dorsal
        this.demarcacion = demarcacion
    }


    fun xogarPartido():Unit{
        println("JUEGA")
    }
    fun entrenar():Unit{
        println("ENTRENA")
    }


    override fun concentrarse(tiempoConcentracion: Int): String {
        return "Concentrase a seleccion durante $tiempoConcentracion minutos"
    }

    override fun viaxar(pais: String): String {
        return return  "Viaxan os xogadores ... $pais"
    }

    override fun toString(): String {
        return super.toString()+", dorsal=$dorsal, demarcacion='$demarcacion'"
    }

}
