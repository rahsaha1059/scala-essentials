package com.rsaha.bound

import com.rsaha.relation.{Animal, Pet}

class PetContainerUpperBound[T <: Pet](t:T) {

  def pet: T = t
}
