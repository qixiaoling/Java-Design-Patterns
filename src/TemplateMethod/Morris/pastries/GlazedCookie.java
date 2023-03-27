package TemplateMethod.Morris.pastries;

public class GlazedCookie extends Cookie{
    {price = 0.41;}

    @Override
    protected void decorate() {
        System.out.println("Add glazing");
    }
}
