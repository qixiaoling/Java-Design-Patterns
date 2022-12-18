package Observer.komtEenKonijnBijDeBakker;


public class CarrotCakeListener implements Listener {

    private String customerName;

    public CarrotCakeListener(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void update(Event eventType) {
        System.out.println("Carrot cake is ready, please contact " + customerName + " concerning " + eventType);
    }
}
