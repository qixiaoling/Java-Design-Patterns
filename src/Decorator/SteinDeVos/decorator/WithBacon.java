package Decorator.SteinDeVos.decorator;

public class WithBacon extends PancakeDecorator {

    public WithBacon(Pancake pancake) {
        super(pancake);
    }
    @Override
    public String getDescription() {
        return pancake.getDescription() + ", with bacon";
    }

    @Override
    public double getCost() {
        return pancake.getCost() + 3;
    }
}
