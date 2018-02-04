object test_0001{

}


object test {
  def main(args: Array[String]): Unit = {
    val nums = List(1, 2, 3)
    val sum1 = nums.reduce((a, b) => a + b) //6
    val sum2 = nums.reduce(_ + _) //6
    val sum3 = nums.sum //6
  }
}


object arrayTest extends App {
  var increase = (x: Int) => x + 1
  val someNumbers = List(-11, -10, -5, 0, 5, 10)
  var b = someNumbers.foreach(increase)
  println(b.getClass)
  var c = someNumbers.map(increase)
  println(c.getClass)
  c.foreach((x: Int) => print(x + " "))
  println()
  c.map((x: Int) => print(x + " "))

}