package com.rsaha.bound

import com.rsaha.relation.Pet

class PetContainerLowerBound[T >: Pet](t:T) {

  def pet:T = t

}
