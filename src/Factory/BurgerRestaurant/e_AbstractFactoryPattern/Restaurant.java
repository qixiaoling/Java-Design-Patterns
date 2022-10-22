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
//The single factory pattern is not enough anymore, now it is time to starting thinking about abstract factory pattern;
//abstract factory pattern explicitly declare interfaces for each distinct product we have; and then make all variance of
//these products follow those interfaces.
//And then within the restaurant class, we should now create each factory method for each distinct product that we have.
//And each factory class in our case, each restaurant will return a product of an interface of a particular kind, so in our case,
//one method that makes the beef burger, one that returns the veggie burger, but please know that it only returns the interface,
//and NOT the concrete class.

//We use abstract factory pattern when we have a various families of related products. In the beginning maybe you don't know
//how many type of products there might be, so you start with factory pattern and let it evolve over time.
//It follows the open-close and single responsibilities principles and centralize the product createion code in one place.

