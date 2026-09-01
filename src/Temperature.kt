abstract class Temperature (
    val unit: Unit,
    private var temp: Double = 0.0
) : ITemperature {

    init {
        // Temp is stored as Kelvin
        setTemp(unit, temp)
    }

    private fun setTemp(unit: Unit, temp: Double) {
        this.temp = when (unit) {
            Unit.C -> 273.15 + temp
            Unit.F -> ((temp - 32) * (5.0 / 9.0)) + 273.15
            else -> temp
        }
    }

    fun setTemp (temp: Double) {
        setTemp(unit, temp)
    }

    protected fun getTemp(unit: Unit): Double = when (unit) {
        Unit.K -> temp + 273.15
        Unit.F -> ((temp - 273.15) * (9.0 / 5.0)) + 32
        else -> this.temp
    }

    enum class Unit {
      C, F, K
    }
}


class Celsius(temp: Double = 0.0) : Temperature(Temperature.Unit.C, temp) {
    override fun getTemp() = super.getTemp(unit)
    override fun getTempIn(unit: Unit) = super.getTemp(unit)
}

class Kelvin(temp: Double = 0.0) : Temperature(Temperature.Unit.K, temp) {
    override fun getTemp() = super.getTemp(unit)
    override fun getTempIn(unit: Unit) = super.getTemp(unit)
}

class Fahrenheit(temp: Double = 0.0) : Temperature(Temperature.Unit.F, temp) {
    override fun getTemp() = super.getTemp(unit)
    override fun getTempIn(unit: Unit) = super.getTemp(unit)
}
