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

