package Factory.BurgerRestaurant.c_SimpleFactoryIdiom;

public class Restaurant {
    public Burger orderBurger(String request){
        SimpleBurgerFactory factory = new SimpleBurgerFactory();
        Burger burger = factory.createBurger(request);
        burger.prepare();
        return burger;

    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.orderBurger("BEEF");
    }
}
//It isn't a full-fledged offical pattern, it is more of an idiom that is commonly used.
//why? Although the SimpleBurgerFactory class is now encapsulated and has single responsibility, but if you look closely,
//you will see this class on its own is still open for modification and when we add more recipes to our menu, we will
//have to open this method and change it.

//In order to fix this...
