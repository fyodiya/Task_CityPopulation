object Population3rdTry extends App {
  def nextYear (p0: Int, pDelta: Double, percentage: Double, targetPopulation: Int) = targetPopulation - (p0 + pDelta + percentage/100)
println("function to calculate the growth of city population")
  def getCityYear(p0: Int, pDelta: Double, percentage: Double, targetPopulation: Int): Unit = {
    var yearCounter = 0
    var currentPopulation = nextYear(p0: Int, pDelta: Double, percentage: Double, targetPopulation: Int)
    var isTargetPopulationAccomplished = false

    if (currentPopulation < targetPopulation) {
      yearCounter = -2
      isTargetPopulationAccomplished = true
    }
    else if (currentPopulation == targetPopulation) {
      yearCounter = -1
      isTargetPopulationAccomplished = true
      println("the city will never reach its target population!")
    }
     while (!isTargetPopulationAccomplished && currentPopulation < targetPopulation) {
       currentPopulation = nextYear(p0: Int, pDelta: Double, percentage: Double, targetPopulation: Int)
       yearCounter += 1
       println(s"After $yearCounter years the city population will reach target population")
     }

  }
  println(getCityYear(1000, 2, 50, 1200)) // should print 3
  println(getCityYear(1000, 2, -50, 1200)) // should print -1
  println(getCityYear(1500000, 2.5, 10000, 2000000)) // should print 10

}