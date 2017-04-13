package parrot

import org.junit.Test

import junit.framework.Assert.assertEquals

class ParrotTest {

    @Test fun getSpeedOfEuropeanParrot() {
        val parrot = Parrot.european()
        assertEquals(parrot.speed, 12.0)
    }

    @Test fun getSpeedOfAfricanParrot_With_One_Coconut() {
        val parrot = Parrot.african(1)
        assertEquals(parrot.speed, 3.0)
    }

    @Test fun getSpeedOfAfricanParrot_With_Two_Coconuts() {
        val parrot = Parrot.african(2)
        assertEquals(parrot.speed, 0.0)
    }

    @Test fun getSpeedOfAfricanParrot_With_No_Coconuts() {
        val parrot = Parrot.african(0)
        assertEquals(parrot.speed, 12.0)
    }

    @Test fun getSpeedNailedParrot() {
        val parrot = Parrot.norwegianBlue(1.5, true)
        assertEquals(parrot.speed, 0.0)
    }

    @Test fun getSpeedWastedParrot() {
        val parrot = Parrot.wasted()
        assertEquals(parrot.speed, 0.0)
    }

    @Test fun getSpeedNorwegianBlueParrot() {
        val parrot = Parrot.norwegianBlue(1.5, false)
        assertEquals(parrot.speed, 18.0)
    }

    @Test fun getSpeedNorwegianBlueParrot_high_voltage() {
        val parrot = Parrot.norwegianBlue(4.0, false)
        assertEquals(parrot.speed, 24.0)
    }
}