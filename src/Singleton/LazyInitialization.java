package Singleton;

public class LazyInitialization {
    private static LazyInitialization theOnlyInstance = null;

    private LazyInitialization(){

    }
    public static LazyInitialization getInstance(){
        if(theOnlyInstance == null){
            theOnlyInstance = new LazyInitialization();
        }
        return theOnlyInstance;
    }
}

class MainLazy {
    public static void main(String[] args) {
        LazyInitialization e1 = LazyInitialization.getInstance();
        LazyInitialization e2 = LazyInitialization.getInstance();

        if(e1 == e2) {
            System.out.println("Objects are same");
        }else {
            System.out.println("Objects are different");
        }
    }
}
