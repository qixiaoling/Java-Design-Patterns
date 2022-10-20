package Factory.BurgerRestaurant.b_SlightlyBetter_ButStillBadExample;

public abstract class Burger {
    private int productId;
    private String addOns;

    public abstract void prepare();

    public Burger() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getAddOns() {
        return addOns;
    }

    public void setAddOns(String addOns) {
        this.addOns = addOns;
    }
}
