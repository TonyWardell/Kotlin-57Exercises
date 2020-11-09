package chapterone

fun main() {
  println("What is your name?")
  val a: String = readLine()?:"noname"
  println("Hello $a")
}