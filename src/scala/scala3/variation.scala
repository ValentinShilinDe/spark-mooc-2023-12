package scala3.variation


// 1. class Foo[+A] ковариантный класс
// 2. class Foo[-A] контрвариантный класс
// 2. class Foo[A] инвариантный класс


class Box[A](var content: A)

abstract class Animal {
  def name: String
}

case class Cat(name: String) extends Animal
case class Dog(name: String) extends Animal


class variation {
  //1. инвариантость
//  val x = new Box[Cat](Cat("sdfsdfg"))
//  val x_animal: Box[Animal] = x
//  val x1 = x_animal.content
  //2. ковариантность
  class ImmutableBox[+A] (val content: A)
  val catbox: ImmutableBox[Cat] = new ImmutableBox[Cat](Cat("sdfsdf"))
  val animalBox: ImmutableBox[Animal] = catbox
  //3. контрвариантность



}
