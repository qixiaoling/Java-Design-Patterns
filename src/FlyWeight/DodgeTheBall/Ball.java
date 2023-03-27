package FlyWeight.DodgeTheBall;

public class Ball {

    private final int coordX;
    private final int coordY;

    private final BallType type;

    public Ball(int coordX, int coordY, BallType type) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.type = type;
    }




    public int getCoordY() {
        return coordY;
    }

    public BallType getType() {
        return type;
    }

    public int getCoordX() {
        return coordX;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "coordX=" + coordX +
                ", coordY=" + coordY +
                ", type=" + type +
                '}';
    }
}
