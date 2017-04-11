package parrot;

public abstract class Parrot {

    public abstract double getSpeed();

    double getBaseSpeed() {
        return 12.0;
    }


    static Parrot european() {
        return new EuropeanParrot();
    }

    static Parrot african(int numberOfCoconuts) {
        return new AfricanParrot(numberOfCoconuts);
    }

    static Parrot norwegianBlue(double voltage, boolean isNailed) {
        if(isNailed){
            return new NailedParrot();
        }
        return new NorwegianBlueParrot(voltage);
    }

    static Parrot wasted() {
        return new WastedParrot();
    }
}
