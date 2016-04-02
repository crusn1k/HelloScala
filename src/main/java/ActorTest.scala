import akka.actor.{Actor, ActorSystem, Props}

/**
  * Created by Nishikant on 4/2/2016.
  */

class MyActor extends Actor {
  override def receive: Receive = {
    case s: String => println("Hello bc " + s)
    case i: Int => println("MKC " + i)
  }
}

object ActorTest {

  def main(args: Array[String]): Unit = {
    val system = ActorSystem("Test")
    val actor = system.actorOf(Props[MyActor], "mkc")
    actor ! "swastika"
    actor ! 1337

    system.terminate()
  }
}
