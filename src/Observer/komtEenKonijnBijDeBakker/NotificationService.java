package Observer.komtEenKonijnBijDeBakker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationService {

    private final Map<Event, List<Listener>> customers;

    public NotificationService() {
        customers = new HashMap<>();
        Arrays.stream(Event.values()).forEach(event -> customers.put(event, new ArrayList<>()));
    }

    public void subscribe(Event eventType, Listener listener){
        customers.get(eventType).add(listener);
    }

    public void unsubscribe(Event eventType, Listener listener) {
        customers.get(eventType).remove(listener);
    }

    public void notifyCustomers(Event eventType){
        customers.get(eventType).forEach(listener -> listener.update(eventType));
    }
}
