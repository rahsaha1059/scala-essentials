package com.rsaha.variancebound

import com.rsaha.relation.Pet

class PetContainer[+T <: Pet](t:T) {

  def pet: T = t

}
