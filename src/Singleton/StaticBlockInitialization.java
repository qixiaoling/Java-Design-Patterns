package Singleton;

public class StaticBlockInitialization {

    private static StaticBlockInitialization staticBlock = null;

    private StaticBlockInitialization(){

    }
    static {
        try {
            staticBlock = new StaticBlockInitialization();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static StaticBlockInitialization getInstance() {
        return staticBlock;
    }


}

class MainStatic {
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
