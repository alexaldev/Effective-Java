package chapter2.builders;

import chapter2.di.LexiconFactory;
import chapter2.di.SpellChecker;
import chapter2.obsolete_object_reference.Stack;
import chapter2.singleton.Elvis;
import chapter2.singleton.ElvisSingleton;
import chapter3.equality.ColorPoint;
import chapter3.equality.Point;

import java.awt.*;

public class Driver {

    public static void main(String[] args) {

        final NutricionFacts nf = NutricionFacts.newBuilder(10, 10)
                .calories(123)
                .sodium(123)
                .carbonhydrate(123)
                .build();

        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.LARGE)
                .addTopping(Pizza.Topping.MUSHROOM)
                .addTopping(Pizza.Topping.ΗAM)
                .build();

        ElvisSingleton.getInstance().dance();
        Elvis.INSTANCE.dance();

        final SpellChecker sc = new SpellChecker(new LexiconFactory());
        System.out.println(sc.isValid("hell"));
        System.out.println(sc.isValid("on earth"));

        // Equality
        Point p = new Point(1,2);
        ColorPoint cp = new ColorPoint(1,2, Color.BLUE);

        System.out.println(p.equals(cp));
        System.out.println(cp.equals(p));
    }
}
