package Commend.before;

public class Calculator_before {
    private int value;

    public Calculator_before() {
        this.value = 0;
    }

    private void add (int valueToAdd){
        this.value = this.value + valueToAdd;
    }

    private void subtract (int valueToSubtract) {
        this.value = this.value - valueToSubtract;
    }

    private void multiply (int valueToMultiply) {
        this.value = this.value * valueToMultiply;
    }

    private void divide (int valueToDivide) {
        this.value = this.value / valueToDivide;
    }
}
