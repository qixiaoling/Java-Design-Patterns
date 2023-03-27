package FlyWeight.DodgeTheBall;

import java.util.HashMap;
import java.util.Map;

public class BallFactory {
    private static final Map<String, BallType> ballTypes = new HashMap<>();
    public static BallType manageBallType (String type, String color, String imageURL) {
        if(ballTypes.get(type) == null){
            ballTypes.put(type, new BallType(type, color, imageURL));
        }
        return ballTypes.get(type);
    }
}
