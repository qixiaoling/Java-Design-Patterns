package Memento.pastries;

public class Cookie extends Pastry{
    {price = 0.35;}
    @Override
    protected void makeDough() {
        System.out.println("Make cookie dough");
    }
    @Override
    protected void bakeDough() {
        System.out.println("Bake cookie in oven");
    }
    @Override
    protected void decorate() {// Cookies do not need to be decorated
    }
    @Override
    protected void plate() {
        System.out.println("Put cookie in a little bag");
    }
}
