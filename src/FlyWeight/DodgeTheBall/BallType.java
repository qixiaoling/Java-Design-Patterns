package FlyWeight.DodgeTheBall;

public class BallType {

    private final String type;
    private final String color;
    private final String imageURL;




    public BallType(String type, String color, String imageURL) {
        this.type = type;
        this.color = color;
        this.imageURL = imageURL;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getImageURL() {
        return imageURL;
    }

    @Override
    public String toString() {
        return "BallType{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
