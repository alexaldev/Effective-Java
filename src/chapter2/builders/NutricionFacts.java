package chapter2.builders;

public class NutricionFacts {

    private final int servingSize; // (mL) required
    private final int servings; // (per container) required
    private final int calories; // (per serving) optional
    private final int fat; // (g/serving) optional
    private final int sodium; // (mg/serving) optional
    private final int carbohydrate; // (g/serving) optional

    public static Builder newBuilder(final int serviceSize, final int servings) {
        return new Builder(serviceSize, servings);
    }

    public static class Builder {

        private final int serviceSize;
        private final int servings;

        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int serviceSize, int servings) {
            this.serviceSize = serviceSize;
            this.servings = servings;
        }

        public Builder calories(int val)      { calories = val; return this; }
        public Builder fat(int val)           { fat = val; return this; }
        public Builder sodium(int val)        { sodium = val; return this; }
        public Builder carbonhydrate(int val) { carbohydrate = val; return this; }

        public NutricionFacts build() {
            return new NutricionFacts(this);
        }
    }

    private NutricionFacts(Builder builder) {
        servingSize = builder.serviceSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }
}
