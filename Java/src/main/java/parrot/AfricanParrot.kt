package parrot

class AfricanParrot internal constructor(private val numberOfCoconuts: Int) : Parrot() {

    companion object {
        private val LOAD_FACTOR = 9.0
    }

    override val speed get() = Math.max(0.0, baseSpeed - LOAD_FACTOR * numberOfCoconuts)
}