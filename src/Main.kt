fun main() {
    val myCelTemp: Celsius = Celsius()

    println("The celsius temperature is ${myCelTemp.getTemp()}")
    println("The celsius temperature in K is ${myCelTemp.getTempIn(Temperature.Unit.K)}")
}
