package builder;

public class Cocktail {
    private String alcohol;
    private String fruit;
    private String sugar;
    private boolean spices;

    private Cocktail(Builder builder) {
        this.alcohol = builder.alcohol;
        this.fruit = builder.fruit;
        this.sugar = builder.sugar;
        this.spices = builder.spices;
    }

    @Override
    public String toString() {
        return "Cocktail{" +
                "alcohol='" + alcohol + '\'' +
                ", fruit='" + fruit + '\'' +
                ", sugar='" + sugar + '\'' +
                ", spices=" + spices +
                '}';
    }

    public static class Builder {
        private String alcohol;
        private String fruit;
        private String sugar;
        private boolean spices;

        public Builder() {
        }

        public Builder alcohol(String alcohol) {
            this.alcohol = alcohol;
            return this;
        }

        public Builder fruit(String fruit) {
            this.fruit = fruit;
            return this;
        }

        public Builder sugar(String sugar) {
            this.sugar = sugar;
            return this;
        }

        public Builder spices(boolean spices) {
            this.spices = spices;
            return this;
        }

        public Cocktail shake() {
            return new Cocktail(this);
        }
    }
}
