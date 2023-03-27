package Prototype.xmas;

public interface Card extends Cloneable {

    boolean isFolding();

    boolean hasFrontText();

    String getFrontText();

    String getImageURL();

    String getInsideText();

    String getFooterText();

    String getRecipientAddress();
    Card clone();
}
