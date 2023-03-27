package TemplateMethod.Morris.nonTemplatePastries;

public class NonTemplateCookie implements NonTemplatePastry{
    protected double price = 0.35;

    public final void bake() {
        System.out.println("This will just take a moment!");
        System.out.println("Make cookie dough");
        System.out.println("Bake cookie in oven");
        System.out.println("Put cookie in a little bag");
        System.out.println("Charge customer €"+price);
        System.out.println("Have a nice day!");
        System.out.println("--------------------------");
    }
}
