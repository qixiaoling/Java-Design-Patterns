package Factory.BurgerRestaurant.e_AbstractFactoryPattern;

public class AmericanVeggieBurger implements VeggieBurger{
    @Override
    public void createBurger() {
        System.out.println("Creating American Veggie Burger...");

    }
}
