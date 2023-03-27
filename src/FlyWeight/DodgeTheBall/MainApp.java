package FlyWeight.DodgeTheBall;



public class MainApp {
    private static final int BALL_TYPE = 2;
    private static final int BALL_TO_FALL = 10_000_000;
    public static void main(String[] args) {
        Game game = new Game();
        for (int i = 0; i < BALL_TO_FALL / BALL_TYPE; i++) {
            game.createBalls(getCoordX(), getCoordY(), "dark", "Blue", "url1");
            game.createBalls(getCoordX(), getCoordY(), "light", "yellow", "url2");
        }



        System.out.println(BALL_TO_FALL + " Balls Created");
        System.out.println("==========================================");
        System.out.println("Memory Usage: ");
        System.out.println("Ball Size (20 bytes) * " + BALL_TO_FALL + " + BallType Size (30 bytes) * " + BALL_TYPE + "");
        System.out.println("==========================================");
        System.out.println("Total: " + ((BALL_TO_FALL * 20 + BALL_TYPE * 30) / 1024 / 1024) +
                "MB (instead of " + ((BALL_TO_FALL * 50) / 1024 / 1024) + "MB)");

    }

    private static int getCoordX() {
        return (int)(Math.random() * 50);
    }

    private static int getCoordY() {
        return (int) (Math.random() * 50);
    }
}
