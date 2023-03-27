package Mediator.JelmerDijkstra.StructuredRestaurant;

public class Barista implements Component {

    protected Mediator waiter;

    public Barista(Mediator waiter) {
        this.waiter = waiter;
    }

    public void receiveOrder(ORDER event) {
        if (event.equals(ORDER.COFFEE)) {
            System.out.println("Barista is preparing coffee...");
            this.coffeeReady();
        }
    }

    private void coffeeReady() {
        System.out.println("The coffee is ready to be served");
        this.waiter.notify(this, ORDER.COFFEE);
    }
}
