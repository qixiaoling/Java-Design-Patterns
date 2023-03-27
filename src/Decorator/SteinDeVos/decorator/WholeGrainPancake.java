package Decorator.SteinDeVos.decorator;

public class WholeGrainPancake extends Pancake {
    public WholeGrainPancake() {
    }

    @Override
    public String getDescription() {
        return "A whole grain pancake";
    }

    @Override
    public double getCost() {
        return 6;
    }
}
