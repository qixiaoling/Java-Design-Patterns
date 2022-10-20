package Factory.BurgerRestaurant.e_AbstractFactoryPattern;

public class VeggieBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Burger...");
    }
}
