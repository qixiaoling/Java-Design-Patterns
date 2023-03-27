package Mediator.JelmerDijkstra.ChaoticRestaurant;

import Orders.SimpleMeal;

public class Cook {

    private SimpleMeal meal;

    public void orderMeal() {
        this.meal = new SimpleMeal();
    }

    public boolean isMealReady() {
        return meal != null;
    }

    public SimpleMeal getMeal() {
        return this.meal;
    }

}
