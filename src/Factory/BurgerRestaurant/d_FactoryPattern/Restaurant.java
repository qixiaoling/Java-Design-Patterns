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


//Use it if you have no idea of the exact types of the objects your code will work with. it makes it easy to extend the product construction code independently form the rest of the application, it allows introducing
//new products without breaking existing code. It centralizes the product creation code in one place in the program.

//But now imagine your burger ordering business is expanding. You decided to open up an Italian restaurant with also Beef and Veggie features.
//Are you going to split it up? Again your code will be open for modification, and become dependent again on the request object (by using if-else). that is not what you want.

