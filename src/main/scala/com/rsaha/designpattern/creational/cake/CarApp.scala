package com.rsaha.designpattern.creational.cake

object CarApp extends App {

  val audiCar = new Car with AudiCarComponentRegistry
  audiCar.drive()
  val bmwCar = new Car with BmwCarComponentRegistry
  bmwCar.drive()
}
