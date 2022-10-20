package Factory.BurgerRestaurant.d_FactoryPattern;

public class VeggieBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Burger...");
    }
}
