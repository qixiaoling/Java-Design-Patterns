package Observer.komtEenKonijnBijDeBakker;

import java.util.List;

public class FishCakeListener implements Listener {

    private String customerName;

    public FishCakeListener(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void update(Event eventType) {
        System.out.println("Fish cake is ready, please contact " + customerName + " concerning " + eventType );
    }
}
