package com.ee.function

/**
 * @author zhengyi
 */
object HighFunction {
  def main(args: Array[String]): Unit = {
    //Array(1, 2, 3).map((x: Int) => x * 3).foreach(println)
    //Array(1, 2, 3).map{ (x: Int) => x * 3 }.foreach { println }
    
    def highFunc(f: (Int) => Int) = f(2)
    println(highFunc(_ * 3))
  }
}