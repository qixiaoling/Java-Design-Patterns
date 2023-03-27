package Mediator.JelmerDijkstra.StructuredRestaurant;

public class Bartender implements Component  {

    protected Mediator waiter;

    public Bartender(Mediator waiter) {
        this.waiter = waiter;
    }

    public void receiveOrder(ORDER event) {
        if (event.equals(ORDER.BEER)) {
            System.out.println("Bartender is tapping beer...");
            this.beerTapped();
        }
    }

    public void beerTapped() {
        System.out.println("Bartender has beer ready");
        this.waiter.notify(this, ORDER.BEER);
    }
}
