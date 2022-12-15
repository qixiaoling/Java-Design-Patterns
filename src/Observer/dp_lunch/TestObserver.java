package Observer.dp_lunch;

import java.io.ObjectStreamException;

public class TestObserver {
    public static void main(String[] args) {
        Bakery bakery = new Bakery();
        Animals Rabbit = new Animals("Rabbie");
        Animals Cat = new Animals("Cattie");
        Cake cake = new Cake("John", "Dundee", "You 've got a secret lover");

        bakery.attach(Rabbit);
        bakery.attach(Cat);

        bakery.addMail(cake);


    }
}
