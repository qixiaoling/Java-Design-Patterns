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

    }

}
//Factory Pattern Looses the coupling of a given code by separating the product's construction code from the code that uses this product.
//what we did here is to remove the SimpleBurgerFactory class, put the logic back to the Restaurant class and start from scratch.

