package example

import com.github.caeus.beanpuree.{Child, LabelledBeanGeneric}
import shapeless._
import com.github.caeus.beanpuree._
import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "say hello" in {

     println( BeanGeneric[Child](BeanGeneric.materialize[Child,shapeless.::[String, shapeless.HNil]]))



  }
}
