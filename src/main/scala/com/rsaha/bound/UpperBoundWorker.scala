package com.rsaha.bound

import com.rsaha.common.AbstractMain
import com.rsaha.relation.{Car, Cat, Dog, Lion}

object UpperBoundWorker extends AbstractMain{
  override def process(): Unit = {

//    if below 3 lines are used in the code with PetContainer class's bound removed there is not error
//    val car: Car = Car("wagonr")
//    val petBox = new PetContainer[Car](car)
//    println(petBox.pet)

    val dog: Dog = new Dog
    val cat: Cat = new Cat
    val lion = new Lion
    val petBox1 = new PetContainerUpperBound[Cat](cat)
    val petBox2 = new PetContainerUpperBound[Dog](dog)

    println(petBox1.pet.name)
    println(petBox2.pet.name)

//    below line does not compile as it does not conforms the type parameter bounds
//    val petBox3 = new PetContainer[Lion](lion)
//    println(petBox3.pet.name)
  }
}
