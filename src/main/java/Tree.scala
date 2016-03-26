/**
  * Created by Nishikant on 3/26/2016.
  */
abstract class Tree
case class Add(l: Tree, r: Tree) extends Tree
case class Minus(l: Tree, r: Tree) extends Tree
case class Multiply(l: Tree, r: Tree) extends Tree
case class Divide(l: Tree, r: Tree) extends Tree
case class Var(n: String) extends Tree
case class Const(v: Int) extends Tree

object TreeTest {
  def main(array: Array[String]): Unit = {
    type Environment = String => Int

    def eval(t: Tree, env: Environment): Int = t match {
      case Add(l, r) => eval(l, env) + eval(r, env)
      case Minus(l, r) => eval(l, env) - eval(r, env)
      case Multiply(l, r) => eval(l, env) * eval(r, env)
      case Divide(l, r) => eval(l, env) / eval(r, env)
      case Var(n)    => env(n)
      case Const(v)  => v
    }

    println(eval(Add(Var("x"), Const(2)), (x)=>4))
    println(eval(Minus(Var("x"), Const(2)), (x)=>4))
    println(eval(Multiply(Var("x"), Const(2)), (x)=>4))
    println(eval(Divide(Var("x"), Const(2)), (x)=>4))
  }
}
