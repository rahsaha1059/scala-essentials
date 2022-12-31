package com.rsaha.designpattern.creational.cake

abstract class Car {

  this : EngineComponent with WheelComponent with BrandComponent =>

  def drive(): Unit = {
    engine.start()
    wheel.rotate()
    brand.light()
  }
}
