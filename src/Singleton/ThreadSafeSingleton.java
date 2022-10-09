package Singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton theOnlyInstance = null;

    private ThreadSafeSingleton(){

    }
    public static synchronized ThreadSafeSingleton getInstance(){
        if(theOnlyInstance == null) {
            theOnlyInstance = new ThreadSafeSingleton();
        }

        return theOnlyInstance;
    }
}

class MainThreadSafe {
    public static void main(String[] args) {
        ThreadSafeSingleton e1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton e2 = ThreadSafeSingleton.getInstance();

        if(e1 == e2) {
            System.out.println("Objects are same");
        }else {
            System.out.println("Objects are different");
        }
    }
}

