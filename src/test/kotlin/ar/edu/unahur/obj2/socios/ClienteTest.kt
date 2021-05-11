package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe


class ClienteTest : DescribeSpec({

  describe("Un/a cliente feliz viviendo en las rosas") {
    val estella = EstadoAnimoFeliz(200,100)
    estella.propinaSegunAnimo().shouldBe(50)


  }
})
