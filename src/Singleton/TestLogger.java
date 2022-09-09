package Singleton;

public class TestLogger {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLoggerInstance();
        Logger logger2 = Logger.getLoggerInstance();
        System.out.println(logger1.hashCode());
        System.out.println(logger2.hashCode());
    }
}
