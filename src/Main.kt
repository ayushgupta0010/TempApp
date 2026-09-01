fun main() {
    val myCelTemp: Celsius = Celsius(100.0)

    println("The celsius temperature is ${myCelTemp.getTemp()}")
    println("The celsius temperature in K is ${myCelTemp.getTempIn(Temperature.Unit.K)}")
}
