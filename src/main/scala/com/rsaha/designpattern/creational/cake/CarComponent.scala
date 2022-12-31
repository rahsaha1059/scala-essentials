package com.rsaha.designpattern.creational.cake

trait EngineComponent {

  val engine: Engine
  trait Engine{

    def start():Unit
  }

  class V6Engine extends Engine{
    override def start() { println("vroom vroom v6engine")}
  }
  class V8Engine extends Engine{
    override def start(): Unit = {println("vroom vroom v8engine")}
  }
}
trait WheelComponent {

  val wheel:Wheel
  trait Wheel{
    def rotate():Unit
  }

  class MichelinWheel extends Wheel{
    override def rotate(){ println("michelin wheel rotated")}
  }
  class DunlopWheel extends Wheel{
    override def rotate(){println("dunlop wheel rotated")}
  }

}
trait BrandComponent {

  val brand: Brand

  trait Brand{
    def light(): Unit
  }

  class AudiBrand extends Brand{
    override def light() {println("i am audi")}
  }
  class BmwBrand extends Brand{
    override def light(){println("i am bmw")}
  }
}