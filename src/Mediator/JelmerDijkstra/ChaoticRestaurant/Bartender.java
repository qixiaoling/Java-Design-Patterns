package Mediator.JelmerDijkstra.ChaoticRestaurant;

import Orders.Drink;

public class Bartender {

    private Drink drink;

    public void orderDrink() {
        this.drink = new Drink();
    }

    public boolean isDrinkReady() {
        return this.drink != null;
    }

    public Drink getDrink() {
        return this.drink;
    }
}
