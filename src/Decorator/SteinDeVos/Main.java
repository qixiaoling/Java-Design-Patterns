package Decorator.SteinDeVos;

import com.capgemini.decorator.*;

public class Main {


    public static void main(String[] args) {
        Pancake pancakeWithSugar = new WithSugar(new WholeGrainPancake());
        printPancakeDetails(pancakeWithSugar);

        Pancake soyPancakeWithSugarAndSyrup = new WithSugar(new WithSyrup( new WithSyrup(new SoyMilkPancake())));
        printPancakeDetails(soyPancakeWithSugarAndSyrup);

        Pancake pancakeWithBacon = new WithBacon(new GlutenFreePancake());
        printPancakeDetails(pancakeWithBacon);
    }


    public static void printPancakeDetails(Pancake pancake) {
        String details = String.format("""
                ------------------------ PANCAKE ------------------------
                Pancake description: %s
                Pancake cost: %,.2f
                ---------------------------------------------------------
                """, pancake.getDescription(), pancake.getCost());
        System.out.println(details);
    }
}
