package com.example.demo.scala

object MTScala {
  type Environment = String => Int

  class Reference[T] {
    private var contents: T = _
    def set(value: T) {contents = value}
    def get: T = contents
  }

  def main(args: Array[String]): Unit = {
    val cell = new Reference[Int]
    cell.set(12)
    println("Reference test " + cell.get * 2)

//    val now = new Date
//    val df = getDateInstance(LONG, Locale.FRANCE)
//    println(df format now)

//    oncePerSecond(timeFiles)
    oncePerSecond(() => println("time files like an arrow 2..."))

    val c = new Complex(1.2, 3.4)
    println("complex: " + c.im())

    val exp: Tree = Sum(Sum(Var("x"), Var("x")), Sum(Const(7), Var("y")))
    val env: Environment = {
      case "x" => 5
      case "y" => 7
    }
    println("Expression: " + exp)
    println("Evaluation with x=5, y=7: " + eval(exp, env))

    val date = new Date(2021, 6, 25)
    val date2 = new Date(2021, 6, 28)
    println("Date: " + date)
    println("Date <: " + date.<(date2) )
  }

  def oncePerSecond(cc: () => Unit): Unit = {
    cc()
    Thread.sleep(1000)
  }

  def timeFiles(): Unit = {
    println("time files like an arrow...")
  }

  class Complex(real: Double, imaginary: Double) {
    def re = real
    def im() = imaginary
  }

  abstract class Tree
  case class Sum(l: Tree, r: Tree) extends Tree
  case class Var(n: String) extends Tree
  case class Const(v: Int) extends Tree

  def eval(t: Tree, env: Environment): Int = t match {
    case Sum(l, r) => eval(l, env) + eval(r, env)
    case Var(n) => env(n)
    case Const(v) => v
  }

  trait Ord {
    def < (that: Any) : Boolean
    def <=(that: Any): Boolean =  (this < that) || (this == that)
    def > (that: Any): Boolean = !(this <= that)
    def >=(that: Any): Boolean = !(this < that)
  }

  class Date(y: Int, m: Int, d: Int) extends Ord {
    def year = y
    def month = m
    def day = d
    override def toString(): String = year + "_" + month + "_" + day

    override def equals(obj: Any): Boolean =
      this.isInstanceOf[Date] && {
        val o = obj.asInstanceOf[Date]
        o.day == day && o.month == month && o.year == year
      }

    override def <(that: Any): Boolean = {
      if (!that.isInstanceOf[Date]) {
        sys.error("cannot compare " + that + " and a Date")
      }

      val o = that.asInstanceOf[Date]
      (year < o.year) || (year == o.year && (month < o.month || (month == o.month && day < o.day)))
    }
  }
}
