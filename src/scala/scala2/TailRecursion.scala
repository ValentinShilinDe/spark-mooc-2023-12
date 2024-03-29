package scala2.TailRescursion

import scala.annotation.tailrec


object TailRec {
  def main(args: Array[String]): Unit = {
    val democollection = "line 1":: "line 2" :: "line 3" :: Nil
    println(s"size is ${tailRec(democollection, 0)}")
  }

  @tailrec
  def tailRec(list: List[String], accum: Long) : Long = list match {
    case Nil => accum
    case head :: tail => tailRec(tail, accum + 1)
  }

}
