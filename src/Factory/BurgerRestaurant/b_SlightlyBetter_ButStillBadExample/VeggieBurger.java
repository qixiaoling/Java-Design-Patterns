package Factory.BurgerRestaurant.b_SlightlyBetter_ButStillBadExample;

public class VeggieBurger extends Burger{
    private boolean combo;

    public void prepare(){
        System.out.println("A veggie burger is made.");
    }

    public VeggieBurger() {
    }

    public boolean isCombo() {
        return combo;
    }

    public void setCombo(boolean combo) {
        this.combo = combo;
    }

}
