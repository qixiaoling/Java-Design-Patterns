package Singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton threadSafeSingleton = null;

    private ThreadSafeSingleton(){

    }
    public static synchronized ThreadSafeSingleton getInstance(){
        if(threadSafeSingleton == null) {
            threadSafeSingleton = new ThreadSafeSingleton();
        }

        return threadSafeSingleton;
    }


    class MainThreadSafe {
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
}
//pros: Multiple threads handled;
//cons: Performance is slow;
