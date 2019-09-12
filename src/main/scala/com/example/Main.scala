package com.example

object Main extends App {
  def excite(s: String): String = s"$s!"

  override def main(): Unit = {
    println(excite("Hello, world"))
  }
}
