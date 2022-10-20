package Factory.BurgerRestaurant.e_AbstractFactoryPattern;

public class AmericanBeefBurger implements BeefBurger{
    @Override
    public void createBurger() {
        System.out.println("Creating American Beef Burger...");
    }
}
