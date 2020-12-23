package project0

class ProjectTests extends org.scalatest.funsuite.AnyFunSuite {
  /*
  test("CubeCalculator.cube") {
    assert(CSVReader.cube(3) === 27)
  }
  */
  test("Analysis.countReps"){
    var temp = MainHandler.readCSV()
    assert(Analysis.countReps(temp) === 536)
  }
  test("Analysis.size"){
    var temp = MainHandler.readCSV()
    assert(Analysis.countReps(temp) === 536)
  }
  test("Analysis.countGop"){
    var temp = MainHandler.readCSV()
    assert(Analysis.countParties(temp).contains("249 Republicans"))
  }
  test("Analysis.genderGap"){
    var temp = MainHandler.readCSV()
    assert(Analysis.genderGap(temp).contains("406 Men"))
  }
  test("Analysis.medAge"){
    var temp = MainHandler.readCSV()
    assert(Analysis.medAge(temp) === 57)
  }
}
