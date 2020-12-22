import scala.io
import scala.collection


object CSVReader extends App {
  println("State, Senator")
  val file = io.Source.fromFile("legislators-current.csv")
  // Parses the CSV File and skips the first row 
  for(line <- file.getLines.drop(1)){
    val cols = line.split(",").map(_.trim)
    println(s"${cols(6)}|${cols(0)}")
  }
}