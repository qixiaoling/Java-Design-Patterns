package Decorator.SteinDeVos.decorator;

public abstract class PancakeDecorator extends Pancake {

    Pancake pancake;

    PancakeDecorator(Pancake pancake) {
        this.pancake = pancake;
    }

}
