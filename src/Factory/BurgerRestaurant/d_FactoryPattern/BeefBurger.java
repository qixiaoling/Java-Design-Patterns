package Factory.BurgerRestaurant.d_FactoryPattern;

public class BeefBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Beef Burger...");
    }
}
