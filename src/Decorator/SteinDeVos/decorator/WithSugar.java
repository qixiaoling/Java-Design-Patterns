package Decorator.SteinDeVos.decorator;

public class WithSugar extends PancakeDecorator {


    public WithSugar(Pancake pancake) {
        super(pancake);
    }

    @Override
    public String getDescription() {
        return pancake.getDescription() + ", with sugar";
    }

    @Override
    public double getCost() {
        return pancake.getCost() + 0.5;
    }
}
