package project0

import scala.io
import scala.Console
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.Map



object MainHandler extends App {
  
 // val bufferedSource = io.Source.fromFile("congress.csv").getLines.drop(1).toArray
  
  
  def readCSV() : Array[Array[String]] = {
    io.Source.fromFile("congress.csv")
    .getLines.drop(1)
    .map(_.split(",").map(_.trim.toString))
    .toArray
  }
  
  var matrix = readCSV()
  def num_parties ={
    (Analysis.countParties(matrix))
  } 
  
  println(gender_gap)

  def gender_gap  = {
    (Analysis.genderGap(matrix))
  } 
  
  def median_age = {
    (Analysis.medAge(matrix))
  }
  
  println(num_parties)
 
  println(num_parties)
  println(s"The median age of our representatives is: $median_age")
  //val client = MongoClient()
  //val codecRegistry = fromRegistries()
  //val db = client.getDatabase("mydb").withCodecRegistry(classOf[States])
  
}