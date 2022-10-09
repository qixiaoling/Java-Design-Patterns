package Singleton;

public class StaticBlockInitialization {

    private static StaticBlockInitialization theOnlyInstance = null;

    private StaticBlockInitialization(){

    }
    static {
        try {
            theOnlyInstance = new StaticBlockInitialization();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static StaticBlockInitialization getInstance() {
        return theOnlyInstance;
    }


}

class MainStatic {
    public static void main(String[] args) {
        StaticBlockInitialization e1 = StaticBlockInitialization.getInstance();
        StaticBlockInitialization e2 = StaticBlockInitialization.getInstance();

        if(e1 == e2) {
            System.out.println("Objects are same");
        }else {
            System.out.println("Objects are different");
        }
    }
}
