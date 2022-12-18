package Observer.komtEen_basic;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private final List<CarrotCakeListener> customers;

    public NotificationService() {
        customers = new ArrayList<>();
    }

    public void subscribe (CarrotCakeListener carrotCakeListener) {
        customers.add(carrotCakeListener);
    }

    public void unsubscribe (CarrotCakeListener carrotCakeListener) {
        customers.remove(carrotCakeListener);
    }

    public void notifyCustomers(){
        customers.forEach(carrotCakeListener -> carrotCakeListener.update());
    }
}
