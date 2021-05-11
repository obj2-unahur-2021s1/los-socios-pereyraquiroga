package ar.edu.unahur.obj2.socios

  abstract class Cliente(val plataBolsillo: Int) {

      abstract fun propinaSegunAnimo():Int
 }

   class EstadoAnimoFeliz(val costoPedido : Int, plataBolsillo: Int) : Cliente( plataBolsillo){

    override fun propinaSegunAnimo()= costoPedido*25 /100
}
  class EstadoAnimoEnojado(val costoPedido: Int,  plataBolsillo: Int):Cliente(plataBolsillo){
    override fun propinaSegunAnimo(): Int = 0
}

 class EstadoAnimoIndiferente(val costoPedido: Int,  plataBolsillo: Int):Cliente(plataBolsillo){
    override fun propinaSegunAnimo(): Int = plataBolsillo
}

 class EstadoAnimoResfriado(val costoPedido: Int,  plataBolsillo: Int):Cliente(plataBolsillo){
    override fun propinaSegunAnimo(): Int = costoPedido
}

interface Barrio {
    fun propinaOtorga() :Int
}

class LasRosas() : Barrio{
    override fun propinaOtorga() = 50
}

class LasLauchas() :Barrio{
    override fun propinaOtorga()= 1/2
}

class BarrioVerde():Barrio{
    override fun propinaOtorga(): Int {
        TODO("Not yet implemented")
    }
}

class LasTorres(): Barrio{
    override fun propinaOtorga(): Int {
        TODO("Not yet implemented")
    }
}








