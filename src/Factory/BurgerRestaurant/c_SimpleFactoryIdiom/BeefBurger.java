package Factory.BurgerRestaurant.c_SimpleFactoryIdiom;

public class BeefBurger extends Burger {
    private boolean angus;

    public void prepare(){
        System.out.println("A beef burger is made.");
    }

    public BeefBurger() {
    }


    public boolean isAngus() {
        return angus;
    }

    public void setAngus(boolean angus) {
        this.angus = angus;
    }

}
