package Factory.BurgerRestaurant.b_SlightlyBetter_ButStillBadExample;

public class Restaurant {
    public Burger orderBurger(String request){

        Burger burger = null;
        if("BEEF".equals(request)){
           burger = new BeefBurger();
        } else if("VEGGIE".equals(request)){
            burger = new VeggieBurger();
        }
        burger.prepare();
        return burger;
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.orderBurger("BEEF");
    }
}
//when things change,for example if we add new receipies to the menu or add more product to our restaurant,
// we are going to have to open this code and change it, and that violate our open/close, single responsibility principles.
//we are also making changes in serval places in the app making things worse.
