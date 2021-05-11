package ar.edu.unahur.obj2.socios


abstract class Cliente(val plataBolsillo: Int) {

    abstract fun propina():Int

}

class EstadoAnimoFeliz(val costoPedido : Int, plataBolsillo: Int) : Cliente( plataBolsillo){

    override fun propina()= costoPedido*25 /100
}
class EstadoAnimoEnojado(val costoPedido: Int,  plataBolsillo: Int):Cliente(plataBolsillo){
    override fun propina(): Int = 0
}

class EstadoAnimoIndiferente(val costoPedido: Int,  plataBolsillo: Int):Cliente(plataBolsillo){
    override fun propina(): Int = plataBolsillo
}

class EstadoAnimoResfriado(val costoPedido: Int,  plataBolsillo: Int):Cliente(plataBolsillo){
    override fun propina(): Int = costoPedido
}

class LasRosas(plataBolsillo: Int):Cliente(plataBolsillo){
    override fun propina(): Int {
        return plataBolsillo+50
    }
}
class LasLauchas(plataBolsillo: Int) :Cliente(plataBolsillo ){
    override fun propina(): Int {
        return plataBolsillo/2
    }
}

 class BarrioVerde(plataBolsillo:Int  ):Cliente(plataBolsillo ){

    override fun propina(): Int =
        if (plataBolsillo >= 200) {
            plataBolsillo
        }

        else { error("tiene que ser mayor a 200")}

    }






 class LasTorres(plataBolsillo: Int): Cliente(plataBolsillo ) {
        override fun propina(): Int{return plataBolsillo}


}











