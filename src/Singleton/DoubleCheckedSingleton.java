package Singleton;

public class DoubleCheckedSingleton {
    private static DoubleCheckedSingleton doubleCheckedSingleton = null;

    private DoubleCheckedSingleton(){

    }
    public static DoubleCheckedSingleton getInstance(){
        if(doubleCheckedSingleton == null){
            synchronized (DoubleCheckedSingleton.class){
                if(doubleCheckedSingleton == null){
                    doubleCheckedSingleton = new DoubleCheckedSingleton();
                }
            }
        }
        return doubleCheckedSingleton;
    }
}

class MainDouble {
    public static void main(String[] args) {
        EagerInitialization e1 = EagerInitialization.getInstance();
        EagerInitialization e2 = EagerInitialization.getInstance();

        if(e1 == e2) {
            System.out.println("Objects are same");
        }else {
            System.out.println("Objects are different");
        }
    }
}
