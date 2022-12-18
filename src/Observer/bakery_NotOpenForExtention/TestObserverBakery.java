package Observer.bakery_NotOpenForExtention;


public class TestObserverBakery {
    public static void main(String[] args) {
        Bakery bakery = new Bakery();
        Animal rabbit = new Animal("Robbie");
        Animal cat = new Animal("Kitty");
        Cake cake = new Cake("Robbie", "Carrot");

        bakery.attach(rabbit);
        bakery.attach(cat);

        bakery.addCake(cake);


    }
}
