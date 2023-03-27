package Mediator.JelmerDijkstra.StructuredRestaurant;

public class StructuredRestaurant {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Customer customer = new Customer(waiter);
        customer.placeOrder(ORDER.BEER);
        customer.placeOrder(ORDER.MEAL);
        customer.placeOrder(ORDER.COFFEE);
        customer.placeOrder(ORDER.CHECK);
    }
}
