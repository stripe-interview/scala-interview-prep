package com.example

import org.scalacheck.Prop.propBoolean
import org.scalatest.prop.Checkers
import org.scalatest.{Matchers, WordSpec}

class MainSpec extends WordSpec with Matchers with Checkers {
  "excite" should {
    "shout everything" in {
      check { (s: String) =>
        "endsWith('!')" |: Main.excite(s).endsWith("!")
      }
    }
  }
}
