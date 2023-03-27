package Decorator.SteinDeVos.decorator;

public class WithSyrup extends PancakeDecorator {


    public WithSyrup(Pancake pancake) {
        super(pancake);
    }

    @Override
    public String getDescription() {
        return pancake.getDescription() + ", with syrup";
    }

    @Override
    public double getCost() {
        return pancake.getCost() + 0.75;
    }
}
