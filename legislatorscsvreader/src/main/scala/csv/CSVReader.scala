package scala

import scala.io
import scala.collection.mutable.ArrayBuffer
import org.mongodb.scala._
import scala.concurrent.Future
import scala.util.Try


object CSVReader extends App {
  
  
 // val bufferedSource = io.Source.fromFile("congress.csv").getLines.drop(1).toArray
  var matrix = readCSV()
  
  

  def readCSV() : Array[Array[String]] = {
  io.Source.fromFile("congress.csv")
    .getLines.drop(1)
    .map(_.split(",").map(_.trim.toString))
    .toArray
  }

  printNames()
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
  def printNames(): Unit = {
    for( i<-0 to 535)
    {
      println(matrix(i)(0) + " | " + matrix(i)(5))
    }
  }

  def countReps(): Unit = {
    print("LOL")
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