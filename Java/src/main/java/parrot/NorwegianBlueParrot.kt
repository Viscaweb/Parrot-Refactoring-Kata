package parrot

class NorwegianBlueParrot internal constructor(private val voltage: Double) : Parrot() {

    override val speed get() = Math.min(24.0, voltage * baseSpeed)
}
