package example

import com.github.caeus.beanpuree.{Child, LabelledBeanGeneric}
import shapeless._
import com.github.caeus.beanpuree._
import org.scalatest._
import shapeless.ops.record.Keys

class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "say hello" in {

    val x = LabelledBeanGeneric[Child]
    val keys= Keys[x.Repr]
    println( keys.apply())



  }
}
