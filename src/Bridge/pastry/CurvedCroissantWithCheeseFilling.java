package Bridge.pastry;

import nl.capgemini.design.patterns.base.Pastry;
import nl.capgemini.design.patterns.base.Taste;
import nl.capgemini.design.patterns.base.Texture;

import java.awt.*;
import java.util.StringJoiner;

public class CurvedCroissantWithCheeseFilling implements Pastry {
    private Shape shape = Shape.Crescent;
    private Texture doughTexture = Texture.Flaky;
    private boolean hasDairy = true;
    private boolean hasSugar = false;
    private String fillingName = "Gouda";
    private Color fillingColor = Color.YELLOW;
    private Taste fillingTaste = Taste.SAVOURY;

    @Override
    public Shape getShape() {
        return shape;
    }

    public Texture getDoughTexture() {
        return doughTexture;
    }

    public Boolean hasDairy() {
        return hasDairy;
    }

    public Boolean hasSugar() {
        return hasSugar;
    }

    public String getFillingName() {
        return fillingName;
    }

    @Override
    public Color getFillingColor() {
        return fillingColor;
    }

    @Override
    public Taste getFillingTaste() {
        return fillingTaste;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CurvedCroissant.class.getSimpleName() + "[", "]").add("shape=" + shape)
                .add("texture=" + doughTexture).add("hasDairy=" + hasDairy).add("hasSugar=" + hasSugar)
                .add("fillingName='" + fillingName + "'").add("fillingColor=" + fillingColor)
                .add("fillingTaste=" + fillingTaste).toString();
    }


}
