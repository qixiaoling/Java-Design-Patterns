package Bridge.bridge;

import nl.capgemini.design.patterns.base.Shape;
import nl.capgemini.design.patterns.base.Texture;

import java.util.Optional;

public interface PastryBridge {

    Shape getShape();

    Texture getTexture();

    boolean containsDairy();
    boolean containsSugar();

    Optional<SeperateFilling> getFilling();
    Optional<SeperateTopping> getTopping();

}
