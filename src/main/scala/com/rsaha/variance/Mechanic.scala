package com.rsaha.variance

class Mechanic[-A](content : A){

  def repair(vehicle : A) = vehicle + "- repaired"
}
