package Memento.pastries;

public class Croissant extends Pastry{
    private final String topping;

    public Croissant(String topping){
        this.topping = topping;
        price = 0.5+topping.length()*0.05;
    }

    @Override
    protected void makeDough() {
        System.out.println("Make Croissant Dough");
    }

    @Override
    protected void bakeDough() {
        System.out.println("Bake Croissant in oven");
    }

    @Override
    protected void decorate() {
        System.out.println("Add " + topping);
    }

    @Override
    protected void plate() {
        System.out.println("Plate Croissant");
    }
}
