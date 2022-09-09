package Singleton;

public class Logger {

    private static Logger logger;
    //Third step: make it private and static because static method can only call static;

    private Logger() {
        //First step: make the constructor private, so that no once can create a second instance from outside;
    }

    public static Logger getLoggerInstance(){
        //Second step: make it static, so there is no need to first create instance in the main;
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }
}
