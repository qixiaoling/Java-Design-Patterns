package Singleton;

public class LazyInitialization {
    private static LazyInitialization lazy = null;

    private LazyInitialization(){

    }
    public static LazyInitialization getInstance(){
        if(lazy == null){
            lazy = new LazyInitialization();
        }
        return lazy;
    }
}

class MainLazy {
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