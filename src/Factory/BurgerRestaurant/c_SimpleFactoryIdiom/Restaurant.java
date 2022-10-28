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


