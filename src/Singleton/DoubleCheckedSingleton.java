package Singleton;

public class DoubleCheckedSingleton {
    private static DoubleCheckedSingleton theOnlyInstance = null;

    private DoubleCheckedSingleton(){

    }
    public static DoubleCheckedSingleton getInstance(){
        if(theOnlyInstance == null){
            synchronized (DoubleCheckedSingleton.class){
                if(theOnlyInstance == null){
                    theOnlyInstance = new DoubleCheckedSingleton();
                }
            }
        }
        return theOnlyInstance;
    }
}

class MainDouble {
    public static void main(String[] args) {
        DoubleCheckedSingleton e1 = DoubleCheckedSingleton.getInstance();
        DoubleCheckedSingleton e2 = DoubleCheckedSingleton.getInstance();

        if(e1 == e2) {
            System.out.println("Objects are same");
        }else {
            System.out.println("Objects are different");
        }
    }
}
