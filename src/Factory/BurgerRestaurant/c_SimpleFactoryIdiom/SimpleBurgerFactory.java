package Factory.BurgerRestaurant.c_SimpleFactoryIdiom;

public class SimpleBurgerFactory {
    public Burger createBurger(String request){
        Burger burger = null;
        if("BEEF".equals(request)){
            burger = new BeefBurger();
        } else if("VEGGIE".equals(request)){
            burger = new VeggieBurger();
        }
        burger.prepare();
        return burger;
    }
}
