package Mediator.JelmerDijkstra.StructuredRestaurant;

import Orders.Coffee;
import Orders.Drink;
import Orders.Order;
import Orders.SimpleMeal;

import java.util.ArrayList;
import java.util.List;

public class Waiter implements Mediator {

    private List<Order> orders;
    private Bartender bartender;
    private Cook cook;
    private Barista barista;
    private Customer customer;

    public Waiter() {
        this.orders = new ArrayList<>();
        this.bartender = new Bartender(this);
        this.cook = new Cook(this);
        this.barista = new Barista(this);
        this.customer = new Customer(this);
    }

    @Override
    public void notify(Component sender, ORDER event) {
        if (sender instanceof Customer) {
            switch (event) {
                case BEER:
                    this.orders.add(new Drink());
                    this.bartender.receiveOrder(event);
                    break;
                case MEAL:
                    this.orders.add(new SimpleMeal());
                    this.cook.receiveOrder(event);
                    break;
                case COFFEE:
                    this.orders.add(new Coffee());
                    this.barista.receiveOrder(event);
                    break;
                case CHECK:
                    this.getCheckForCustomer();
                    break;
            }
        }
        if (sender instanceof Bartender) {
            switch (event) {
                case BEER -> this.customer.receiveOrder(event);
            }
        }
        if (sender instanceof Cook) {
            switch (event) {
                case MEAL -> this.customer.receiveOrder(event);
            }
        }
        if (sender instanceof Barista) {
            switch (event) {
                case COFFEE -> this.customer.receiveOrder(event);
            }
        }
    }

    private void getCheckForCustomer() {
        System.out.printf("Your bill is %.2f", this.orders.stream().mapToDouble(Order::getCosts).sum());

    }
}
