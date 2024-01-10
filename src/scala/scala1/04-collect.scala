package  scala1

object Collect extends App{

  case class Car(marke: String, model: String, year:Int)
  val cars = Car("Vw", "id4", 2021) :: "sdljfskjdfh" :: 1 :: Car("Lexus", "Ux", 2019) :: Nil

  cars.collect{
    case x: Car => x.model
    case x: String => "ssdgsdg"
    case x: Int => x.toString
  }.foreach(x => println(x))


}