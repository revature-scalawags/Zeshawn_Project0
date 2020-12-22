object CSVReader extends App {
  println("State, Senator")
  val file = io.Source.fromFile("legislators-current.csv")
  for(line <- file.getLines()){
    println(line)
  }
}