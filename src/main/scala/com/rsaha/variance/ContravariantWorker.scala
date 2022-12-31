package com.rsaha.variance

import com.rsaha.common.AbstractMain
import com.rsaha.relation.{Car, Vehicle}

/**
  * contravariant usecase link- https://dzone.com/articles/why-is-contravariance-in-scala-so-hard
  * rule of thumb: when your generic type "contains" or "produces" elements of type T, it should be covariant. When your generic type
  * "acts on" or "consumes" elements of type T, it should be contravariant.
  */
object ContravariantWorker  extends AbstractMain{
  override def process(): Unit = {

    val vehicleMechanic: Mechanic[Vehicle] = new Mechanic[Vehicle](new Vehicle {
      override def printVehicle: String = "vehicle"
    })

    val carMechanic: Mechanic[Car] = vehicleMechanic

    println(carMechanic.repair(new Car("elantra")))


  }
}
