package com.rsaha.common

abstract class AbstractMain {

  def main(args: Array[String]): Unit = {

    preProcess()
    process()
    postProcess()

  }
  def preProcess() {}
  def process()
  def postProcess() {}


}
