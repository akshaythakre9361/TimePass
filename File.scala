class demoFunction {

  def add(a: Int, b: Int): Int = {
    var sum: Int = 0
    sum = a + b
    return sum
  }

}
object MainObject {
  def main(args: Array[String]): Unit = {
    var s = new demoFunction
    var res = s.add(10,20)
    println("Addition : " + res)
    //new comment
  }
}
