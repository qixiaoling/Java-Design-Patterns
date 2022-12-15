package Observer.dp_lunch;

import Observer.example_One.Observer;

import java.util.ArrayList;

public class Animals implements Observer {
    String name;

    public Animals(String name) {
        this.name = name;
    }

    //sixth: this is the real activity, if name on the mail is same as this person, print it on the screen.
    public void checkCake(ArrayList<Cake> m){
        for (int i=0; i<m.size(); i++){
            if(name.compareTo(m.get(i).receiverName) == 0){
                System.out.println(name + ": " + m.get(i).content);
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
