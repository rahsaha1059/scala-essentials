package com.rsaha.designpattern.structural.decorator

object CoffeeApp extends App {
  val coffee = new SimpleCoffee with MilkAdded with SugarAdded
  println(coffee.getCost)
  println(coffee.getDescription)
}
