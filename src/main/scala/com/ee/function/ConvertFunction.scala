package com.ee.function

/**
 * @author zhengyi
 */
object ConvertFunction {
  def display1(input: String): Unit = println(input)
  def display2(input: Char): Unit = println(input)
  
  implicit def typeConvertor(input: Int): String = input.toString
  implicit def typeConvertor(input: Boolean): String = if (input) "true" else "false"
  implicit def typeConvertor(input: String): Char = input.charAt(0)
    
  def main(args: Array[String]): Unit = {
    display1("1212")
    display1(12)
    display1(true)
    
    display2('a')
    display2("abc")
  }
}