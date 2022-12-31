package com.rsaha.variancebound

import com.rsaha.relation.Pet

class VetDoctor[-T <: Pet] (t:T){

  def healthConsultation = "Consultation provided to - " + t.name

}
