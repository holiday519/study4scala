package com.ee.function

/**
 * @author zhengyi
 */
object Function {
  def main(args: Array[String]): Unit = {
    // 内部方法
    def outer(str1: String) {
      def inner(str2: String) {
        println(str1 + ":" + str2)
      }
    }
    // 函数赋给变量
    val increass = (x: Int) => x + 1
    // 函数当参数传入
    val nums = List(1, -2, 0, -1, 2)
    //nums.filter((x: Int) => x > 0).foreach((x: Int) => println(x))
    //nums.filter(x => x > 0).foreach(x => println(x))
    nums.filter(_ > 0).foreach(println(_))
  }
}