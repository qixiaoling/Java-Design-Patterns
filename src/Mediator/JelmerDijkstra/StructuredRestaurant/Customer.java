package Mediator.JelmerDijkstra.StructuredRestaurant;

public class Customer implements Component {

    protected Mediator waiter;

    public Customer(Mediator waiter) {
        this.waiter = waiter;
    }

    public void placeOrder(ORDER event) {
        System.out.printf("Customer orders %s \n", event);
        this.waiter.notify(this, event);
    }

    public void receiveOrder(ORDER event) {
        System.out.printf("Customer receives %s \n", event);
    }
}
