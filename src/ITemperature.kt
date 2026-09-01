interface ITemperature {
    fun getTemp() : Double // Return base temperature
    fun getTempIn(unit: Temperature.Unit) : Double // Return converted temperature
}
