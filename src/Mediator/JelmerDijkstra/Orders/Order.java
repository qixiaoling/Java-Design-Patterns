package Mediator.JelmerDijkstra.Orders;

public abstract class Order {

    private String name;
    private double costs;

    public Order(String name, double costs) {
        this.name = name;
        this.costs = costs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCosts() {
        return costs;
    }

    public void setCosts(double costs) {
        this.costs = costs;
    }
}
