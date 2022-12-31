package com.rsaha.variancebound

import com.rsaha.common.AbstractMain
import com.rsaha.relation.{Cat, Pet}

object ContravariantUpperBoundWorker extends AbstractMain{
  override def process(): Unit = {

    val vetPet : VetDoctor[Pet] = new VetDoctor[Pet](new Pet {
      override def name: String = "Pet"
    })

    val vetCat : VetDoctor[Cat] = vetPet

    println(vetCat.healthConsultation)
  }
}
