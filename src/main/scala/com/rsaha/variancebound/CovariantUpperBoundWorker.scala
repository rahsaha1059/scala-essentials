package com.rsaha.variancebound

import com.rsaha.common.AbstractMain
import com.rsaha.relation.{Animal, Dog, Pet}

object CovariantUpperBoundWorker extends AbstractMain{

  override def process(): Unit = {

    val dog: Dog = new Dog
    val dogContainer: PetContainer[Dog] = new PetContainer[Dog](dog)

//    below line does not compile if PetContainer +T (covariant in T) is replace with T (invariant in T)
    val petContainer: PetContainer[Pet] = dogContainer
    println(petContainer.pet.name)

//    below line does not compile. To make it compile replace the upper bound of PetContainer from T <: Pet to T <: Animal
//    val animal: Animal = new Animal {
//      override def name: String = "Animal"
//    }
//    val animalContainer: PetContainer[Animal] = petContainer
  }
}
