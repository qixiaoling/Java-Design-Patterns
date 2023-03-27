package FlyWeight.DodgeTheBall;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final List<Ball> balls = new ArrayList<>();
    public void createBalls(int coordX, int coordY, String type, String color, String imageURL) {
        BallType ballType = BallFactory.manageBallType(type, color, imageURL);
        balls.add(new Ball(coordX, coordY, ballType));
    }

    public void displayBalls() {
        balls.forEach(System.out::println);
    }
}
