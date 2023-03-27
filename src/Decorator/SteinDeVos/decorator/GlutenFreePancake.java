package Decorator.SteinDeVos.decorator;

public class GlutenFreePancake extends Pancake {

    public GlutenFreePancake() {}

    @Override
    public String getDescription() {
        return "A gluten free pancake";
    }

    @Override
    public double getCost() {
        return 8;
    }
}
