package parrot

abstract class Parrot {

    abstract val speed: Double

    internal val baseSpeed: Double
        get() = 12.0

    companion object {

        fun european(): Parrot {
            return EuropeanParrot()
        }

        fun african(numberOfCoconuts: Int): Parrot {
            return AfricanParrot(numberOfCoconuts)
        }

        fun norwegianBlue(voltage: Double, isNailed: Boolean = false): Parrot {
            if (isNailed) {
                return NailedParrot()
            }
            return NorwegianBlueParrot(voltage)
        }

        fun wasted(): Parrot {
            return WastedParrot()
        }
    }
}