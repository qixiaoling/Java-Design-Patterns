package Factory.BurgerRestaurant.e_AbstractFactoryPattern;

public class ItalianVeggieBurger implements VeggieBurger{

    @Override
    public void createBurger() {
        System.out.println("Creating Italian Veggie Burger...");

    }
}
