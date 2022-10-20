package Factory.BurgerRestaurant.d_FactoryPattern;

public abstract class Restaurant {
    public Burger orderBurger(){
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }
    public abstract Burger createBurger();

    public static void main(String[] args) {
        Restaurant beefResto = new BeefBurgerRestaurant();
        Burger beefBurger = beefResto.orderBurger();

        Restaurant veggieResto = new VeggieBurgerRestaurant();
        Burger veggieBurger = veggieResto.orderBurger();
    }
}
//Factory Pattern Looses the coupling of a given code by separating the product's construction code from the code that uses this product.
//what we did here is to remove the SimpleBurgerFactory class, put the logic back to the Restaurant class and start from scratch.
//We will make the class abstract, so that the sub classes can implement this createBurger abstract method; You see the factory
//method relies heavily on inheritance,it delegate obj creation to sub-class that implement tha factory method (which is the createBurger()).
//After defining the interface (burger), we let createor subclasses to decide which class to instantiate.

//Now you see the orderBurger method is no langer depends on request object, because the user of the restaurant can now directly instantiate
//the concrete restaurant class implementation they need and the correct burger will be returned to them.

