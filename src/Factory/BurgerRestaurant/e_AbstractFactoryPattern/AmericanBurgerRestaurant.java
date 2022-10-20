package Factory.BurgerRestaurant.e_AbstractFactoryPattern;

public class AmericanBurgerRestaurant extends Restaurant{

    @Override
    public BeefBurger createBeefBurger() {
        return new AmericanBeefBurger();
    }

    @Override
    public VeggieBurger createVeggieBurger() {
        return new AmericanVeggieBurger();
    }
}
