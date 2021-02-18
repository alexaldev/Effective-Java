import chapter3.hashing.PhoneNumber;

import java.util.HashMap;
import java.util.Map;

public class Driver {

    public static void main(String[] args) {

        final Map<PhoneNumber, String> catalogue = new HashMap<>();
        short x = 3232;
        catalogue.put(new PhoneNumber(x, x, x), "Jenny");
        System.out.println(catalogue.get(new PhoneNumber(x, x, x)));
    }
}
