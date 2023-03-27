package Memento.shop;

import pastries.*;

import java.util.ArrayList;
import java.util.List;

public class PastryShop {
    public static void main(String[] args) {
        List<Pastry> orders = new ArrayList<>();
        orders.add(new Croissant("Jam"));
        orders.add(new Cookie());
        orders.add(new Croissant("Jelly"));
        orders.add(new Oliebol());
        orders.add(new GlazedCookie());

        orders.forEach(Pastry::bake);
    }
}
