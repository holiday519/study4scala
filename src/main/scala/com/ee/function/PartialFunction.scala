package com.ee.function

/**
 * @author zhengyi
 */
object PartialFunction {
  def main(args: Array[String]): Unit = {
//    val partial = one orElse two orElse wildcard
//    print(partial(1))
    
    val partial = one andThen firstWord
    print(partial(1))
  }
  
  def one: PartialFunction[Int, String] = {
    case 1 => "one"
  }
  def two: PartialFunction[Int, String] = {
    case 2 => "two"
  }
  def wildcard: PartialFunction[Int, String] = {
    case _ => "something else"
  }
  
  def firstWord: PartialFunction[String, String] = {
    case "one" => "o"
  }
}