package Singleton;

public class BillPughSingleton {
    private BillPughSingleton(){}
    private static class SingletonHelper{
        private static final BillPughSingleton theOnlyInstance = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){
        return SingletonHelper.theOnlyInstance;
    }

}


class MainBill {
    public static void main(String[] args) {
        BillPughSingleton e1 = BillPughSingleton.getInstance();
        BillPughSingleton e2 = BillPughSingleton.getInstance();

        if(e1 == e2) {
            System.out.println("Objects are same");
        }else {
            System.out.println("Objects are different");
        }
    }
}