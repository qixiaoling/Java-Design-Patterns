package Observer.bakery;



import java.util.ArrayList;

public class Animal implements Observer {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    //sixth: this is the real activity, if name on the mail is same as this person, print it on the screen.
    public void checkCake(ArrayList<Cake> cakes){
        for (int i=0; i<cakes.size(); i++){
            if(name.compareTo(cakes.get(i).receiverName) == 0){
                System.out.println(name + ": " + cakes.get(i).flavour);
            }
        }
    }
    //fifth: update method is only checking if this obj from Person angel is
    //a postoffice, (it can of course also be an CD store, we code to interface here)
    // becuase then it will fetch postoffice's maillist and passed in
    //the checkMail method;
    @Override
    public void update(Object obj) {
        if(obj instanceof Bakery){
            Bakery bakery = (Bakery) obj;
            checkCake(bakery.getAllCake());
        }
    }
}
