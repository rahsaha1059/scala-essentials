package com.rsaha.relation

case class Car(value:String) extends Vehicle {
  override def printVehicle: String = value
}
