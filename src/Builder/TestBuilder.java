package Builder;

import java.io.LineNumberReader;

public class TestBuilder {
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.addBread("Wheat").addCondiments("Lettuce").addDressing("Mayo").addMeat("Turkey");
        LunchOrder lunchOrder = builder.makeMeASandwich();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());

    }
}
