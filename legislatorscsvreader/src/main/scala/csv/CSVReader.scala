package congress

import scala.io
import scala.collection.mutable.ArrayBuffer
import org.mongodb.scala._
import scala.concurrent.Future
import scala.util.Try
import scala.collection.mutable.Map


object CSVReader extends App {
  
  
 // val bufferedSource = io.Source.fromFile("congress.csv").getLines.drop(1).toArray
  var matrix = readCSV()
  
  

  def readCSV() : Array[Array[String]] = {
  io.Source.fromFile("congress.csv")
    .getLines.drop(1)
    .map(_.split(",").map(_.trim.toString))
    .toArray
  }

  

  
  // each row is an array of strings (the columns in the csv file)
  //val rows = ArrayBuffer[Array[String]]()

  /**
  def readCSV() : Array[Array[String]] = {
  io.Source.fromFile("legislators-current.csv")
    .getLines.drop(1)
    .map(_.split(",").map(_.trim.toString()))
    .toArray
  }
  val matrix = readCSV()
  countReps()
  */


 
  /**
    val file = io.Source.fromFile("legislators-current.csv")
  // Parses the CSV File and skips the first row 
    for(line <- file.getLines.drop(1)){
    rows += line.split(",").map(_.trim)
    }
    */

  

 
  
  // Prints the name of the person and state they represent
  def printNames( curr : Array[Array[String]]): Unit = {
    
    for( i<-0 to curr.length - 1)
    {
      println(matrix(i)(0) + " | " + matrix(i)(5))
      
    }
    
  }

  def countReps(curr : Array[Array[String]]): Int = {
    var count = 0
    for( i<-0 to curr.length - 1)
    {
      count = count + 1
      
    }
    return count
  }
  
/**
  def using[A <: { def close(): Unit }, B](resource: A)(f: A => B): B =
    try {
       f(resource)
    } finally {
      resource.close()
    }
*/

}