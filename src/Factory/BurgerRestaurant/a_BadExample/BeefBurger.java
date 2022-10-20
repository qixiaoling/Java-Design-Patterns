package Factory.BurgerRestaurant.a_BadExample;

public class BeefBurger {
    private int productId;
    private boolean angus;
    private String addOns;

    public void prepare(){
        System.out.println("A beef burger is made.");
    }



    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public boolean isAngus() {
        return angus;
    }

    public void setAngus(boolean angus) {
        this.angus = angus;
    }

    public String getAddOns() {
        return addOns;
    }

    public void setAddOns(String addOns) {
        this.addOns = addOns;
    }
}
