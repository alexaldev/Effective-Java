package chapter2.static_factory_methods;

public class Car {

    public enum Manufacturer{
        AUDI, SEAT
    }

    // Horsepower - weight
    private static final int AUDI_HORSEPOWER = 120;
    private static final long AUDI_WEIGHT = 1400;
    private static final int SEAT_HORSEPOWER = 88;
    private static final long SEAT_WEIGHT = 990;

    // Single instances
    private static final Car AUDI = new Car(AUDI_HORSEPOWER, AUDI_WEIGHT);
    private static final Car SEAT = new Car(SEAT_HORSEPOWER, SEAT_WEIGHT);

    private final int horsePower;
    private final long weight;

    public static Car from(final Manufacturer manufacturer) {
        switch (manufacturer){
            case SEAT: return SEAT;
            case AUDI:
            default: return AUDI;
        }
    }

    private Car(int horsePower, long weight) {
        this.horsePower = horsePower;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "horsePower=" + horsePower +
                ", weight=" + weight +
                '}';
    }
}
