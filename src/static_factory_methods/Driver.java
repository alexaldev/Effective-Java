package static_factory_methods;

public class Driver {

    public static void main(String[] args) {

        final Car seat = Car.from(Car.Manufacturer.SEAT);
        final Car audi = Car.from(Car.Manufacturer.AUDI);

        System.out.println(seat.toString());
        System.out.println(audi.toString());
    }
}
