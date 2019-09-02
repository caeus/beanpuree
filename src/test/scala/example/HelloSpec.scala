package example

import com.github.caeus.beanpuree.{Child, LabelledBeanGeneric}
import com.github.caeus.beanpuree._
import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "say hello" in {

     println( LabelledBeanGeneric[Child])



  }
}
