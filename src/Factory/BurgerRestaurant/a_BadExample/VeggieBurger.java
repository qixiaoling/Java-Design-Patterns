package Factory.BurgerRestaurant.a_BadExample;


public class VeggieBurger {
    private int productId;
    private boolean combo;
    private String addOns;

    public void prepare(){
        System.out.println("A veggie burger is made.");
    }

    public VeggieBurger() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public boolean isCombo() {
        return combo;
    }

    public void setCombo(boolean combo) {
        this.combo = combo;
    }

    public String getAddOns() {
        return addOns;
    }

    public void setAddOns(String addOns) {
        this.addOns = addOns;
    }
}
