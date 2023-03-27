package Mediator.JelmerDijkstra.ChaoticRestaurant;

import Orders.Order;

public class ChaoticRestaurant {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Cook cook = new Cook();
        Barista barista = new Barista();
        Bartender bartender = new Bartender();

        System.out.println("Dinner at a chaotic restaurant with no waiters...\n");

        System.out.println("You order a beer from the bartender.\n");
        bartender.orderDrink();
        System.out.println("You order a meal from the cook.\n");
        cook.orderMeal();

        System.out.println("You check with the bartender whether your drink is ready\n");
        if (bartender.isDrinkReady()) {
            System.out.println("You retrieve your drink from the bartender\n");
            customer.addOrder(bartender.getDrink());
        }

        System.out.println("You check with the cook whether your meal is ready\n");
        if (cook.isMealReady()) {
            System.out.println("You retrieve your meal from the cook\n");
            customer.addOrder(cook.getMeal());
        }

        System.out.println("You order a coffee from the barista.\n");
        barista.orderCoffee();

        System.out.println("You check with the barista whether your coffee is ready\n");
        if (barista.isCoffeeReady()) {
            System.out.println("You retrieve your coffee from the barista\n");
            customer.addOrder(barista.getCoffee());
        }

        System.out.println("After finishing your dinner, you have to figure out the cost of everything yourself\n");
        customer.setBill(customer.getOrders().stream().mapToDouble(Order::getCosts).sum());
        System.out.printf("Your bill seems to be: %.2f", customer.getBill());
    }
}
