package Bridge.bridge;

import nl.capgemini.design.patterns.base.Taste;

import java.awt.*;
import java.util.StringJoiner;

public class PastryFilling implements SeperateFilling {

    private String name;
    private Color color;
    private Taste taste;

    public PastryFilling(final String name, final Color color, final Taste taste) {
        this.name = name;
        this.color = color;
        this.taste = taste;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public Taste getTaste() {
        return taste;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", PastryFilling.class.getSimpleName() + "[", "]").add("name='" + name + "'")
                .add("color=" + color).add("taste=" + taste).toString();
    }
}
