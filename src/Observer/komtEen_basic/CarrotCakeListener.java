package Observer.komtEen_basic;

public class CarrotCakeListener {

    private final String customerName;

    public CarrotCakeListener(String customerName) {
        this.customerName = customerName;
    }

    public void update(){
        System.out.println("Carrot cake is ready, please contact " + customerName);
    }
}
