package scala1

object Implicits {

  //implicit conversion
  object implicit_conversions {
    // trimToOption => Option[String]
    //1. sting empty or NUll => None
    //2.Some[String]

    //    lazy val str: String = "we"

    implicit class StringOps(str: String) {
      def trimToOption: Option[String] =
        Option(str).map(_.trim).filter(_.nonEmpty)
    }
  }

  import  implicit_conversions._
  "sdfsdf ".trimToOption

  // type conversion is dangerous

}