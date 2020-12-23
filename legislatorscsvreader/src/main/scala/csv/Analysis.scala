package project0
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.Map
import scala.collection



object Analysis {

    

   

    def printNames( curr : Array[Array[String]]): Unit = {
    
     for( i<-0 to curr.length - 1)
        {
         println(curr(i)(0) + " | " + curr(i)(5))
      
        }
    }

    def countParties(curr : Array[Array[String]]): String = {
        
        var gop = 0
        var dem = 0
        var ind = 0

        for( i<-0 to curr.length - 1)
        {
            if(curr(i)(6) == "Democrat"){
             dem = dem + 1
            }
            else if (curr(i)(6) == "Republican"){
             gop = gop + 1
            }
            else if (curr(i)(6) == "Independent"){
             ind = ind + 1
            }
        }
        
        
        var ans = (s"""There are:
                    $dem Democrats
                    $gop Republicans
                    $ind Independents""") 
        

        return ans
    }

    def countReps(curr : Array[Array[String]]): Int = {
        var count = 0
        for( i<-0 to curr.length - 1)
        {
          count = count + 1
      
        }
     return count
    }

     def genderCalc(curr : Array[Array[String]]): String = {
        var men = 0
        var women = 0
        
        
        for( i<-0 to curr.length - 1)
        {
            if(curr(i)(3) == "M"){
             men = men + 1
            }
            else if (curr(i)(3) == "F"){
             women = women + 1
            }
            
        }
        
        
        var ans = (s"""There are:
                    $men Men
                    $women Women """) 
        

        return ans
    }
    def medAge(curr : Array[Array[String]]): Int = {
        var avg = 0
        var math = 0
        for( i<-0 to curr.length - 1)
        {
          var temp = curr(i)(2)
          var lit = temp.substring(temp.length-4, temp.length())
          math = math + lit.toInt
          
        }
        avg = (math / 535)
     return (2020 - avg)
    }
    
}