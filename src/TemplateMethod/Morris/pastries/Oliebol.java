package TemplateMethod.Morris.pastries;

public class Oliebol extends Pastry{
    {price = 1.0;}
    @Override
    protected void makeDough() {
        System.out.println("Make Oliebol Dough");
    }
    @Override
    protected void bakeDough() {
        System.out.println("Cook Oliebol in hot oil");
    }
    @Override
    protected void decorate() {
        System.out.println("Add powdered sugar");
    }
    @Override
    protected void plate() {
        System.out.println("Plate Oliebol");
    }
}
