package Observer.bakery_NotOpenForExtention;



import java.util.ArrayList;

public class Animal implements Observer {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void checkCake(ArrayList<Cake> cakes){
        for (int i=0; i<cakes.size(); i++){
            if(name.compareTo(cakes.get(i).receiverName) == 0){
                System.out.println(name + ": " + cakes.get(i).flavour);
            }
        }
    }
    @Override
    public void update(Object obj) {
        if(obj instanceof Bakery){
            Bakery bakery = (Bakery) obj;
            checkCake(bakery.getAllCake());
        }
    }
}
