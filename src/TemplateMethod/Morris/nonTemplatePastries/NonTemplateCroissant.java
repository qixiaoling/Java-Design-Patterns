package TemplateMethod.Morris.nonTemplatePastries;

public class NonTemplateCroissant implements NonTemplatePastry{
    protected double price;
    private final String topping;

    public NonTemplateCroissant(String topping){
        this.topping = topping;
        price = 0.5+topping.length()*0.05;
    }

    public final void bake() {
        System.out.println("This will just take a moment!");
        System.out.println("Make Croissant Dough");
        System.out.println("Bake Croissant in oven");
        System.out.println("Add " + topping);
        System.out.println("Plate Croissant");
        System.out.println("Charge customer €"+price);
        System.out.println("Have a nice day!");
        System.out.println("--------------------------");
    }
}
