package Factory.Calculation;

public interface Calculate {

    //Don't say hey! Create an add object Add obj = new Add()! NO! You always send the request to some other class, and ask them to create it for you.
    public void calculate(double num1, double num2);

}
