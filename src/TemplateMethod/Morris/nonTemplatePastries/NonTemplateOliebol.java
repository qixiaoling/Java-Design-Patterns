package TemplateMethod.Morris.nonTemplatePastries;

public class NonTemplateOliebol implements NonTemplatePastry{
    protected double price = 1.0;

    public final void bake() {
        System.out.println("This will just take a moment!");
        System.out.println("Make Oliebol Dough");
        System.out.println("Cook Oliebol in hot oil");
        System.out.println("Add powdered sugar");
        System.out.println("Plate Oliebol");
        System.out.println("Charge customer €"+price);
        System.out.println("Have a nice day!");
        System.out.println("--------------------------");
    }
}
