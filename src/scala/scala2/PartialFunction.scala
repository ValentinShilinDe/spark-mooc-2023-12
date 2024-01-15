package scala2.PartialFunction

object PartialFunction {
  val parseRange: PartialFunction[Any, Int] = {
    case x: Int if x>10 => x+1
    case x: Int if x < 4 => x-1
  }

  def main(args: Array[String]): Unit ={
    List(14,15, 3, "dfgsdfb").collect(parseRange).foreach(println)

  }


}
