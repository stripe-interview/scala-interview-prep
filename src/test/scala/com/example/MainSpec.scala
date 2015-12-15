package com.example

import org.scalatest.{ WordSpec, Matchers }
import org.scalatest.prop.Checkers
import org.scalacheck._
import org.scalacheck.Prop._

class MainSpec extends WordSpec with Matchers with Checkers {
  "excite" should {
    "shout everything" in {
      check { (s: String) =>
        "endsWith('!')" |: Main.excite(s).endsWith("!")
      }
    }
  }
}
