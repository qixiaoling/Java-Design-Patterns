package Mediator.JelmerDijkstra.ChaoticRestaurant;

import Orders.Coffee;

public class Barista {

    private Coffee coffee;

    public void orderCoffee() {
        this.coffee = new Coffee();
    }

    public boolean isCoffeeReady() {
        return this.coffee != null;
    }

    public Coffee getCoffee() {
        return this.coffee;
    }
}
