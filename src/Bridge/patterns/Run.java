package Bridge.patterns;

import nl.capgemini.design.patterns.base.Pastry;
import nl.capgemini.design.patterns.pastry.CurvedCroissant;
import nl.capgemini.design.patterns.pastry.CurvedCroissantWithCheeseFilling;
import nl.capgemini.design.patterns.pastry.OlieBol;

/**
 * Hello world!
 *
 */
public class Run
{
    public static void main( String[] args )
    {
        Pastry plainCroissant = new CurvedCroissant();
        System.out.println(plainCroissant);
        Pastry cheeseCroissant = new CurvedCroissantWithCheeseFilling();
        System.out.println(cheeseCroissant);

        Pastry donut = new OlieBol();
        System.out.println(donut);

        Pastry donutWithRaisins = new OlieBol();
        System.out.println(donutWithRaisins);

    }



}
