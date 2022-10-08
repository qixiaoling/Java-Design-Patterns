package Singleton;

public class EagerInitialization {
    private static EagerInitialization eager = new EagerInitialization();

    private EagerInitialization() {

    }

    public static EagerInitialization getInstance(){
        return eager;
    }
}

class MainEager {
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

//Pros: only one object is created
//cons: exception handling not handled; Object always created;.

