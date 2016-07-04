package com.ee.common

/**
 * @author zhengyi
 */
object RegExpress {
  def main(args: Array[String]): Unit = {
    // 一个引号，跟Java相同，\要转义
    val reg1 = "[\\d]+".r
    // 一个引号，\不用转义
    val reg2 = """[\d]+""".r
    
    println(reg1.findFirstIn("123 abc"))
    println(reg2.findFirstIn("123 abc"))
  }
}