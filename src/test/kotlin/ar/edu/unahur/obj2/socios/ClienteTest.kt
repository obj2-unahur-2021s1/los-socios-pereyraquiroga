package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe


class ClienteTest : DescribeSpec({

  describe("Un/a cliente feliz viviendo en las rosas") {
    val estella = EstadoAnimoFeliz(200, 100)
    estella.propina().shouldBe(50)
    LasRosas(estella.propina()).propina().shouldBe(100)

  }

  describe("Un/a cliente enojado viviendo en las Lauchas") {
    val estella = EstadoAnimoEnojado(100, 200)
    estella.propina().shouldBe(0)
    LasLauchas(estella.propina()).propina().shouldBe(0)
  }

  describe("Un/a cliente resfriado viviendo en las Torres") {
    val estella = EstadoAnimoResfriado(costoPedido = 200, plataBolsillo = 100)
    estella.propina().shouldBe(200)
    LasTorres(estella.propina()).propina().shouldBe(200)
  }

  describe("Un/a cliente indiferente viviendo en barrio verde"){
    val estella=EstadoAnimoIndiferente(500,200)
    estella.propina().shouldBe(200)
    BarrioVerde(estella.propina()).propina().shouldBe(200)
  }

  describe("Un cliente resfriado viviendo en las lauchas"){
    val estella=EstadoAnimoResfriado(1000,200)
    estella.propina().shouldBe(1000)
    LasLauchas(estella.propina()).propina().shouldBe(500)
  }


})

