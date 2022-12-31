package com.rsaha.relation

case class Bicycle(value:String) extends Vehicle {
  override def printVehicle: String = value
}
