package parrot;

public class NorwegianBlueParrot extends Parrot {

    private final double voltage;

    NorwegianBlueParrot(double voltage) {
        this.voltage = voltage;
    }

    @Override public double getSpeed() {
        return Math.min(24.0, voltage * getBaseSpeed());
    }
}
