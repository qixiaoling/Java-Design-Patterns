package State;

public abstract class State {
    public void handleRequest() {
        System.out.println("Should't be able to get here");
    }
}
