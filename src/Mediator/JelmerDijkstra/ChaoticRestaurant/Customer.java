package Mediator.JelmerDijkstra.ChaoticRestaurant;

import Orders.Order;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private List<Order> orders;
    private double bill;

    public Customer() {
        this.orders = new ArrayList<>();
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public void removeOrder(Order order) {
        this.orders.remove(order);
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }
}
