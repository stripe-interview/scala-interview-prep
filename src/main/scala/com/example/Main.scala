package com.example

import scala.scalajs.js.JSApp

object Main extends JSApp {
  def excite(s: String): String = s"$s!"

  def main(): Unit = {
    println(excite("Hello, world"))
  }
}
