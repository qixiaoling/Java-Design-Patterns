package Bridge.patterns;

import nl.capgemini.design.patterns.base.Taste;
import nl.capgemini.design.patterns.base.Texture;
import nl.capgemini.design.patterns.pastry.bridge.PastryBridge;
import nl.capgemini.design.patterns.pastry.bridge.PastryFilling;
import nl.capgemini.design.patterns.pastry.bridge.PastryImpl;
import nl.capgemini.design.patterns.pastry.bridge.PastryTopping;
import nl.capgemini.design.patterns.pastry.bridge.SeperateFilling;
import nl.capgemini.design.patterns.pastry.bridge.SeperateTopping;

import java.awt.*;
import java.util.Optional;

public class RunBridge
{
    public static void main( String[] args )
    {

        PastryBridge plainCroissant = new PastryImpl(Shape.Crescent, Texture.Flaky, true, false);
        System.out.println(plainCroissant);

        PastryBridge gewoneOlibol = new PastryImpl(Shape.Sphere, Texture.Doughy, true, true);
        System.out.println(gewoneOlibol);

        SeperateFilling kaas = new PastryFilling("Gouda Cheese", Color.YELLOW, Taste.SAVOURY);
        PastryBridge croissantWithCheeseFilling = new PastryImpl(Shape.Crescent, Texture.Flaky, true, false, Optional.of(kaas));
        System.out.println(croissantWithCheeseFilling);

        SeperateFilling krenten = new PastryFilling("Raisins", Color.BLACK, Taste.SWEET);
        PastryBridge oliebolWithRaisens = new PastryImpl(Shape.Sphere, Texture.Doughy, true, true, Optional.of(krenten));
        System.out.println(oliebolWithRaisens);

        SeperateTopping glaze = new PastryTopping("Sugar Glaze", Color.WHITE, Taste.SWEET);
        PastryBridge glazedDonut = new PastryImpl(Shape.Torus, Texture.Cakey, true, true, Optional.empty(), Optional.of(glaze));
        System.out.println(glazedDonut);

    }


}
