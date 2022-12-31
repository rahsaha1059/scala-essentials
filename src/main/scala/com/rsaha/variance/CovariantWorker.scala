package com.rsaha.variance

import com.rsaha.common.AbstractMain
import com.rsaha.relation.{Car, Vehicle}

object CovariantWorker extends AbstractMain{
  override def process(): Unit = {

    val carContainer: ContainerCovariant[Car] = new ContainerCovariant[Car](Car("venue"))
    val vehicleContainer: ContainerCovariant[Vehicle] = carContainer
    val vehicle = vehicleContainer.content

    println(vehicle)

  }
}
