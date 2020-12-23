package project0

import scala.io
import scala.collection.mutable.ArrayBuffer
import org.mongodb.scala.MongoClient
import scala.util.Try
import scala.collection.mutable.Map
import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global


object MainHandler extends App {
  
  
 // val bufferedSource = io.Source.fromFile("congress.csv").getLines.drop(1).toArray
  var matrix = readCSV()
  
  

  def readCSV() : Array[Array[String]] = {
  io.Source.fromFile("congress.csv")
    .getLines.drop(1)
    .map(_.split(",").map(_.trim.toString))
    .toArray
  }
  
  
  var ans = Analysis.countParties(matrix)
  

  var check = Analysis.genderCalc(matrix)
  
  var yes = Analysis.medAge(matrix)
  println(yes)
  

  def using[A <: { def close(): Unit }, B](resource: A)(f: A => B): B =
    try {
       f(resource)
    } finally {
      resource.close()
    
     }
}