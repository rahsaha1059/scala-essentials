package com.rsaha.variance

import com.rsaha.common.AbstractMain
import com.rsaha.relation.{Car, Vehicle}

object InvariantWorker extends AbstractMain{

  override def process(): Unit = {

    val carContainer: Container[Car] = new Container[Car](Car("elite-i20"))
    //    Below line will not compile due to invariance in scala. By default all the type parameter (A) are invariant. It means even though Car
    //    subtype of Vehicle but the Container[Car] is not subtype of Container[Vehicle]
    //    val vehicleContainer: Container[Vehicle] = carContainer
    val vehicle : Vehicle = carContainer.content
    println(vehicle)
  }
}
