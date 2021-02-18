package chapter2.builders;

import java.util.EnumSet;
import java.util.Set;

public abstract class Pizza {
    public enum Topping {ΗAM, MUSHROOM, ONION}
    private final Set<Topping> toppings;

    abstract static class  Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping t) {
            toppings.add(t);
            return self();
        }

        abstract Pizza build();

        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
