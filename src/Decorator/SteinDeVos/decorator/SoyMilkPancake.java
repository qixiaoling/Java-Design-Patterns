package Decorator.SteinDeVos.decorator;

public class SoyMilkPancake extends Pancake {
    @Override
    public String getDescription() {
        return "A soy milk pancake";
    }

    @Override
    public double getCost() {
        return 10;
    }
}
