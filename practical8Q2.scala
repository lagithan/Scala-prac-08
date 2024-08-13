import scala.io.StdIn

object Q2 {
  def main(args: Array[String]): Unit = {
    println("Please enter an integer:")
    
    val input = try {
      StdIn.readInt()
    } catch {
      case _: NumberFormatException =>
        println("Invalid input. Please enter a valid integer.")
        return
    }

    val isMultipleOfThree: Int => Boolean = _ % 3 == 0
    val isMultipleOfFive: Int => Boolean = _ % 5 == 0

    // Pattern matching to categorize the number
    val message = input match {
      case x if isMultipleOfThree(x) && isMultipleOfFive(x) => "Multiple of Both Three and Five"
      case x if isMultipleOfThree(x) => "Multiple of Three"
      case x if isMultipleOfFive(x) => "Multiple of Five"
      case _ => "Not a Multiple of Three or Five"
    }

    println(message)
  }
}
