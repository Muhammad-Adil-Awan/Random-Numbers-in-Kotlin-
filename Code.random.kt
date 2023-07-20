fun main() {
  val number = Array(11) { i -> i * 1 }
  val number1 = Array(11) { i -> i * 1 }
  for (x in 0..10)
  {
    number[x]= (1..6).random()
  }
  println("Before copying :")
  for (y in 0..10)
  {
    println("${number[y]}")
  }
  for (y in 0..10)
  {
    number1[y]=number[y]
  }
  println("After copying :")
  for (y in 0..10)
  {
    println("${number1[y]}")
  }
}
