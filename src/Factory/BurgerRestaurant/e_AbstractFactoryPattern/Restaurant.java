package Factory.BurgerRestaurant.e_AbstractFactoryPattern;


public abstract class Restaurant {

    public abstract BeefBurger createBeefBurger();
    public abstract VeggieBurger createVeggieBurger();

    public static void main(String[] args) {
        Restaurant americanBurgerRestaurant = new AmericanBurgerRestaurant();
        BeefBurger americanBeefBurger = americanBurgerRestaurant.createBeefBurger();
        VeggieBurger americanVeggieBurger = americanBurgerRestaurant.createVeggieBurger();


        Restaurant italianBurgerRestaurant = new ItalianBurgerRestaurant();
        BeefBurger italianBeefBurger = italianBurgerRestaurant.createBeefBurger();
        VeggieBurger italianVeggieBurger = italianBurgerRestaurant.createVeggieBurger();



        System.out.println(americanBeefBurger, americanVeggieBurger, italianVeggieBurger, italianBeefBurger);

    }

}
