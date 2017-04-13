package parrot

abstract class Parrot {

    abstract val speed: Double

    internal val baseSpeed: Double
        get() = 12.0

    companion object {

        fun european() = EuropeanParrot()

        fun african(numberOfCoconuts: Int) = AfricanParrot(numberOfCoconuts)

        fun norwegianBlue(voltage: Double, isNailed: Boolean = false) =
                if (isNailed) NailedParrot() else NorwegianBlueParrot(voltage)

        fun wasted() = WastedParrot()
    }
}