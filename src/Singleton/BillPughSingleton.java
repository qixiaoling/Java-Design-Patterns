package Singleton;

public class BillPughSingleton {
    private BillPughSingleton(){

    }
    private static class SingletonHelper{
        private static final BillPughSingleton bill = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.bill;
    }

}


class MainBill {
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