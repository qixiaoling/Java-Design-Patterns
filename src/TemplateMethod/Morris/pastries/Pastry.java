package TemplateMethod.Morris.pastries;

public abstract class Pastry {
    protected double price;

    /** These methods have specific implementations */
    protected abstract void makeDough();
    protected abstract void bakeDough();
    protected abstract void plate();
    protected abstract void decorate();


    /** these methods stay the same */
    private void comfortCustomerAboutWaitTime() {
        System.out.println("Hi! This will just take a moment!");
    }

    private void chargeCustomer() {
        System.out.println("Charge customer €"+price);
    }

    private void informCustomerTheyAreLegallyRequiredToHaveANiceDay() {
        System.out.println("Have a nice day!");
        System.out.println("--------------------------");
    }

    public final void bake() {
        // common
        comfortCustomerAboutWaitTime();

        // specific
        makeDough();
        bakeDough();
        decorate();
        plate();

        // common
        chargeCustomer();
        informCustomerTheyAreLegallyRequiredToHaveANiceDay();
    }
}
