package Factory.BurgerRestaurant.e_AbstractFactoryPattern;

public class ItalianBurgerRestaurant extends Restaurant{
    @Override
    public BeefBurger createBeefBurger() {
        return new ItalianBeefBurger();
    }
    @Override
    public VeggieBurger createVeggieBurger() {
        return new ItalianVeggieBurger();
    }
}
