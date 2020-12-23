package congress

class CSVTester extends org.scalatest.funsuite.AnyFunSuite {
  /*
  test("CubeCalculator.cube") {
    assert(CSVReader.cube(3) === 27)
  }
  */
  test("CSVReader.countReps"){
    var temp = CSVReader.readCSV()
    assert(CSVReader.countReps(temp) === 536)
  }
  
}
