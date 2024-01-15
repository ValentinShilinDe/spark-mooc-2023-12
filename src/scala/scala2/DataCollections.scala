package scala2.DataCollection


object DataObject {
  def main(args: Array[String]): Unit = {
    val demoCollectionList: List[String] = "line 1" :: "line 2" :: "line 3" :: Nil
    val demoCollectionSet = ("line 1" :: "line 2":: "line 2" :: "line 3" :: Nil).toSet
    val demoCollection1 = ("line 1" :: "line 2":: "line 2" :: "line 3" :: Nil).groupBy(x=>x).map(x=>x._1)
//    demoCollection1.foreach(x=>println(x))

    val iter = demoCollectionList.iterator
    while (iter.hasNext){
      println(iter.next)
    }

    println("demo function")
    val demoCollecttion = 1::2::3::Nil
    //1 fold
    println(s"fold result : ${demoCollecttion.fold(0)((z,i)=>z+i)}")
    //2 fold left
    println(s"fold left result : ${demoCollecttion.foldLeft(0)((z,i)=>z+i)}")
    //3 reduce
    println(s"reduce result : ${demoCollecttion.reduce((z,i)=>z+i)}")


    val test: List[List[Int]] = List(1,2,3,4,5) :: List(1,50,3) :: List(1,2) :: Nil
    test.filter(x=> x.reduce((y,z) => y+z) > 10 ).foreach(x=>println(x.mkString(",")))

    println(test.flatMap(x=>x).mkString(","))












  }

}