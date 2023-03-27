package FlyWeight;

public class Ball {

    private final int coordX;
    private final int coordY;
    private final int type;
    private final String color;
    private final String imageURL;


    public Ball(int coordX, int coordY, int type, String color, String imageURL) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.type = type;
        this.color = color;
        this.imageURL = imageURL;
    }



    public int getCoordX() {
        return coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public int getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getImageURL() {
        return imageURL;
    }
}
