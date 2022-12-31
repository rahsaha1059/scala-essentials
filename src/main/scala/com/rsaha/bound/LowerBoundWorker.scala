package com.rsaha.bound

import com.rsaha.common.AbstractMain
import com.rsaha.relation.{Animal, Cat, Lion}

object LowerBoundWorker extends AbstractMain{
  override def process(): Unit = {

    val cat: Cat = new Cat
    val lion = new Lion
    val animal = new Animal {
      override def name: String = "Animal"
    }

//    below lines compile with error with PetContainerLowerBound defined as Pet
//    val petBox1 = new PetContainerLowerBound[Cat](cat)
//    println(petBox1.pet.name)

    val petBox2 = new PetContainerLowerBound[Animal](animal)
    println(petBox2.pet.name)



  }
}
