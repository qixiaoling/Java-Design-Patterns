package Decorator.SteinDeVos.decorator;

public class WithCheese extends PancakeDecorator {


    public WithCheese(Pancake pancake) {
        super(pancake);
    }


    @Override
    public String getDescription() {
        return pancake.getDescription() + ", with cheese";
    }

    @Override
    public double getCost() {
        return pancake.getCost() + 1.25;
    }
}
