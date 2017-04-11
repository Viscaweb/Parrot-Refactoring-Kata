package parrot;

/**
 * Created by damiengavard on 10/04/2017.
 */
public class AfricanParrot extends Parrot {

    private static final double LOAD_FACTOR = 9.0;
    private final int numberOfCoconuts;

    AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - LOAD_FACTOR * numberOfCoconuts);
    }

}
