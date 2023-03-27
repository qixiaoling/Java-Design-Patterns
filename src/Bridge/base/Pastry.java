package Bridge.base;

import java.awt.*;

public interface Pastry {

    Shape getShape();

    Texture getDoughTexture();

    Boolean hasDairy();

    Boolean hasSugar();

    String getFillingName();

    Color getFillingColor();

    Taste getFillingTaste();

}
