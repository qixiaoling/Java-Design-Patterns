package Bridge.bridge;

import nl.capgemini.design.patterns.base.Shape;
import nl.capgemini.design.patterns.base.Texture;

import java.util.Optional;
import java.util.StringJoiner;

public class PastryImpl implements PastryBridge {

    private Shape shape;
    private Texture texture;

    private boolean hasDairy;
    private boolean hasSugar;
    private Optional<SeperateFilling> filling;
    private Optional<SeperateTopping> topping;

    public PastryImpl(final Shape shape, final Texture texture, final boolean hasDairy,
            final boolean hasSugar) {
        this.shape = shape;
        this.texture = texture;
        this.hasDairy = hasDairy;
        this.hasSugar = hasSugar;
        this.filling = Optional.empty();
        this.topping = Optional.empty();
    }

    public PastryImpl(final Shape shape, final Texture texture, final boolean hasDairy,
            final boolean hasSugar, final Optional<SeperateFilling> filling) {
        this.shape = shape;
        this.texture = texture;
        this.hasDairy = hasDairy;
        this.hasSugar = hasSugar;
        this.filling = filling;
        this.topping = Optional.empty();
    }

    public PastryImpl(final Shape shape, final Texture texture, final boolean hasDairy, final boolean hasSugar,
            final Optional<SeperateFilling> filling, final Optional<SeperateTopping> topping) {
        this.shape = shape;
        this.texture = texture;
        this.hasDairy = hasDairy;
        this.hasSugar = hasSugar;
        this.filling = filling;
        this.topping = topping;
    }

    @Override
    public Shape getShape() {
        return shape;
    }

    @Override
    public Texture getTexture() {
        return texture;
    }

    @Override
    public boolean containsDairy() {
        return hasDairy;
    }

    @Override
    public boolean containsSugar() {
        return hasSugar;
    }

    @Override
    public Optional<SeperateFilling> getFilling() {
        return filling;
    }

    @Override
    public Optional<SeperateTopping> getTopping() {
        return topping;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", PastryImpl.class.getSimpleName() + "[", "]").add("shape=" + shape)
                .add("texture=" + texture).add("hasDairy=" + hasDairy).add("hasSugar=" + hasSugar)
                .add("filling=" + filling)
                .add("topping=" + topping)
                .toString();
    }


}
