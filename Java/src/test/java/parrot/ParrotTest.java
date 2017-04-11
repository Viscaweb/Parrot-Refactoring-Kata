package parrot;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ParrotTest {

    @Test
    public void getSpeedOfEuropeanParrot() {
        Parrot parrot = Parrot.european();
        assertEquals(parrot.getSpeed(), 12.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_One_Coconut() {
        Parrot parrot = Parrot.african(1);
        assertEquals(parrot.getSpeed(), 3.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
        Parrot parrot = Parrot.african(2);
        assertEquals(parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_No_Coconuts() {
        Parrot parrot = Parrot.african(0);
        assertEquals(parrot.getSpeed(), 12.0);
    }

    @Test
    public void getSpeedNailedParrot() {
        Parrot parrot = Parrot.norwegianBlue(1.5, true);
        assertEquals(parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedWastedParrot() {
        Parrot parrot = Parrot.wasted();
        assertEquals(parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot() {
        Parrot parrot = Parrot.norwegianBlue(1.5, false);
        assertEquals(parrot.getSpeed(), 18.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_high_voltage() {
        Parrot parrot = Parrot.norwegianBlue(4, false);
        assertEquals(parrot.getSpeed(), 24.0);
    }
}
