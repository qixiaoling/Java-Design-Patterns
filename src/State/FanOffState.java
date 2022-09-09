package State;

public class FanOffState extends State{
    private Fan fan;

    public FanOffState(Fan fan) {
        this.fan = fan;
    }

    //fourth: Now it changes the "state" to fanLowState and print out "off, turning fan on to low".
    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to low.");
        fan.setState(fan.getFanLowState());
    }
    public String toString() {
        return "Fan is off.";
    }
}
