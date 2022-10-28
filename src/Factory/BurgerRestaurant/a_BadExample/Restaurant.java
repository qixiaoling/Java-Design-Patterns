package Factory.BurgerRestaurant.a_BadExample;

public class Restaurant {
    public ??? orderBurger(String request){
        if("BEEF".equals(request)){
            BeefBurger burger = new BeefBurger();
            burger.prepare();
            return burger;
        } else if("VEGGIE".equals(request)){
            VeggieBurger burger = new VeggieBurger();
            burger.prepare();
            return burger;

        }
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.orderBurger("BEEF");
    }
}
