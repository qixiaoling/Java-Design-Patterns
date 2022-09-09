package Factory;

import java.util.Locale;

public class CalculateFactory {

    //taken the requirement that you need, based on that requirement, it will create the object and send it to you.
    //There is only one place to create the object. If you even need to change the way the object is created, there is only one place.
    public Calculate getCalculation(String calType) {
        Calculate obj = null;
        if (calType.toLowerCase().equals("add")) {
            obj = new Add();
        }else if (calType.toLowerCase().equals("subtract")) {
            obj = new Subtract();
        }else if (calType.toLowerCase().equals("divide")){
            obj = new Divide();
        }else{
            System.out.println("we don't do that!");
        }

        return obj;
    }
}
