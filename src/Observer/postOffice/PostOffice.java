package Observer.postOffice;

import java.util.ArrayList;

public class PostOffice implements Subject {

    private ArrayList<Mail> allMail;
    private ArrayList<Observer> observers;

    public PostOffice(){
        allMail = new ArrayList<>();
        observers = new ArrayList<>();
    }
    //third: add mail, when this new mail is added, postoffice need to nodify everyone;
    public void addMail(Mail m){
        allMail.add(m);
        Notify();
    }
    public ArrayList<Mail> getAllMail() {
        return allMail;
    }

    //first: postoffice add people who wants to get notified; add Chris;
    //second: add John;
    @Override
    public void attach(Observer o) {
        observers.add(o);

    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    //fourth: notify = let Chris and John uses update method. The object passes in is only
    //defined from the angel of Person, person can decide which subject he wants to get notified from (can also be an CD store),
    //in this case : postoffice;
    @Override
    public void Notify() {
        for(int i=0; i<observers.size();i++){
            observers.get(i).update(this);
        }
    }
}
