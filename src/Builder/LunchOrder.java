package Builder;

public class LunchOrder {
    public static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder () {

        }

        public LunchOrder makeMeASandwich() {
            return new LunchOrder(this);
        }
        public Builder addBread(String bread) {
            this.bread = bread;
            return this;
        }
        public Builder addCondiments(String condiments) {
            this.condiments = condiments;
            return this;
        }
        public Builder addDressing(String dressing) {
            this.dressing = dressing;
            return this;
        }
        public Builder addMeat(String meat) {
            this.meat = meat;
            return this;
        }

    }

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;
    private LunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
