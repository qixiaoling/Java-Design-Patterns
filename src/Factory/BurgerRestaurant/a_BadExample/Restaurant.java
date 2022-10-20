package Factory.BurgerRestaurant.a_BadExample;

public class Restaurant {
    public void orderBurger(String request){
        if("BEEF".equals(request)){
            BeefBurger beefBurger = new BeefBurger();
            beefBurger.prepare();
            //return beefBurger;
        } else if("VEGGIE".equals(request)){
            VeggieBurger veggieBurger = new VeggieBurger();
            veggieBurger.prepare();
            //return veggieBurger;

        }
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.orderBurger("BEEF");
    }
}
