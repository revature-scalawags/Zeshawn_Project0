# An Organized Congress
A simple Scala command line interface application project. This organizes current members of United States congress from a csv file. 

## Compile
>sbt compile 

## Test
>sbt test

## Run
>sbt --error run 

# Requirements
Java 8 (Recommended) https://java.com/en/download/manual.jsp

Scala and SBT (https://www.scala-lang.org/download/2.12.8.html)

MongoDB https://www.mongodb.com/try/download/community

# Features
function countReps(Array [Array[String]] matrix) - Calculates total number of representatives to ensure the data is secure

function countParties(Array [Array[String]] matrix) - Calculates disparities between political parties

function genderCalc(Array [Array[String]] matrix) - Calculates disparities between men and women 

function medAge (Array [Array[String]] matrix) - Calculates the median age among all congress

# Analysis / MongoDB
- Mongo compass used to parse csv and provide statistics
- M - 75% ,  F - 25%
- Dem - 56%, 44%
- 13% CA 
- 9% FL, 
- 5% IL, 
- 5% TX, 
- 5% NY 
- California shares more than half the representatives than the third largest state, Illinois
# Testing
- countReps
- size
- countGOP
- countMale

# Credits
CSV File credit to https://github.com/unitedstates/congress-legislators