package Factory.BurgerRestaurant.e_AbstractFactoryPattern;

public class ItalianBeefBurger implements BeefBurger{
    @Override
    public void createBurger() {
        System.out.println("Creating Italian Beef Burger...");

    }
}
