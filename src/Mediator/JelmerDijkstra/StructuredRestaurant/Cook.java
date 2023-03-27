package Mediator.JelmerDijkstra.StructuredRestaurant;

public class Cook implements Component {

    protected Mediator waiter;

    public Cook(Mediator waiter) {
        this.waiter = waiter;
    }

    public void receiveOrder(ORDER event) {
        if (event.equals(ORDER.MEAL)) {
            System.out.println("Cook is preparing meal...");
            this.mealPrepared();
        }
    }

    private void mealPrepared() {
        System.out.println("The meal is ready to be served");
        this.waiter.notify(this, ORDER.MEAL);
    }
}
