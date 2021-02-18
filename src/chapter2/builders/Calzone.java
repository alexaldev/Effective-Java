package chapter2.builders;

public class Calzone extends Pizza {
    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private final boolean sauceInside;

        public Builder(final boolean sauceInside) {
            this.sauceInside = sauceInside;
        }

        @Override
        Calzone build() {
            return new Calzone(self());
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }
}
