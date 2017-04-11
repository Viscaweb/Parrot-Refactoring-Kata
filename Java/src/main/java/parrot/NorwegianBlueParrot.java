package parrot;

/**
 * Created by damiengavard on 10/04/2017.
 */
public class NorwegianBlueParrot extends Parrot {

    private final double voltage;

    NorwegianBlueParrot(double voltage) {
        this.voltage = voltage;
    }

    @Override
    public double getSpeed() {
        return Math.min(24.0, voltage *getBaseSpeed());
    }

}
