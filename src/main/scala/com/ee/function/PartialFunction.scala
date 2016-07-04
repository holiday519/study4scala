package com.ee.function

/**
 * @author zhengyi
 */
object PartialFunction {
  def main(args: Array[String]): Unit = {
    // 偏函数
    def sum1(a: Int, b: Int) = a + b
    def sum2(a: Int)(b: Int) = a + b
    def sum3(a: Int) = (b: Int) => a + b
    // 
    val sum1_a_1 = sum1(1, _: Int)
    val sum2_a_1 = sum2(1)(_: Int)
    val sum3_a_1 = sum3(1)
    // _代表所有参数未赋值（其实就是将该方法赋值给变量，不写这个就会报错）
    val sum1_ = sum1 _
    //
    println(sum1_a_1(2))
    println(sum2_a_1(3))
    println(sum3_a_1(4))
  }
  
}