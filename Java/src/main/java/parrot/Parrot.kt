package parrot

abstract class Parrot {

    abstract val speed: Double

    internal val baseSpeed: Double
        get() = 12.0

    companion object {

        fun european(): Parrot = EuropeanParrot()

        fun african(numberOfCoconuts: Int): Parrot = AfricanParrot(numberOfCoconuts)

        fun norwegianBlue(voltage: Double, isNailed: Boolean = false): Parrot =
                if (isNailed) NailedParrot() else NorwegianBlueParrot(voltage)

        fun wasted(): Parrot = WastedParrot()
    }
}