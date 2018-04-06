package com.example

object Main extends App {
  def excite(s: String): String = s"$s!"

  def main(): Unit = {
    println(excite("Hello, world"))
  }
}
