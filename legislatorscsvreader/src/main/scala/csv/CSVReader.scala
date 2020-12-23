import scala.io
import scala.collection.mutable.ArrayBuffer


object CSVReader extends App {
  
  // each row is an array of strings (the columns in the csv file)
  val rows = ArrayBuffer[Array[String]]()


  println("State, Name")
  val file = io.Source.fromFile("legislators-current.csv")
  // Parses the CSV File and skips the first row 
  for(line <- file.getLines.drop(1)){
    rows += line.split(",").map(_.trim)
    
  }

  for (row <- rows) {
      println(s"${row(6)}|${row(0)}")
  }

  def using[A <: { def close(): Unit }, B](resource: A)(f: A => B): B =
    try {
       f(resource)
    } finally {
      resource.close()
    }
}