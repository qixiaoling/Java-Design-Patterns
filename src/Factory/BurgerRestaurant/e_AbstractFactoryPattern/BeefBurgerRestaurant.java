package Factory.BurgerRestaurant.e_AbstractFactoryPattern;

public class BeefBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger(){
        return new BeefBurger();
    }
}
