import org.rotach.Twos
import org.scalatest._

class TwoTest extends FlatSpec with Matchers {

  "twos" should "return 0 if there are no twos" in {
    val t = new Twos()
    t.twos(Array(1, 4, 5, 6, 3)) should be (0)
  }

  "twos" should "return 1 if there is one two" in {
    val t = new Twos()
    t.twos(Array(1, 4, 5, 2, 6, 3)) should be (1)
  }

  "twos" should "return 2 if there are two twos" in {
    val t = new Twos()
    t.twos(Array(2, 1, 4, 5, 6, 3, 2)) should be (2)
  }

  "nottwos" should "return 5 if there are no twos in a 5 element array" in {
    val t = new Twos()
    t.nottwos(Array(1, 4, 5, 6, 3)) should be (5)
  }

  "nottwos" should "return 1 if there are no twos in a 1 element array" in {
    val t = new Twos()
    t.nottwos(Array(2)) should be (1)
  }
}
