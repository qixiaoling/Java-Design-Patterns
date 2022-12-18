package Observer.bakery_NotOpenForExtention;


import java.util.ArrayList;

public class Bakery implements Business {

    private ArrayList<Cake> allCake;
    private ArrayList<Observer> observers;

    public Bakery(){
        allCake = new ArrayList<>();
        observers = new ArrayList<>();
    }
    public void addCake(Cake cake){
        allCake.add(cake);
        Notify();
    }
    public ArrayList<Cake> getAllCake() {
        return allCake;
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);

    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void Notify() {
        for(int i=0; i<observers.size();i++){
            observers.get(i).update(this);
        }
    }
}
