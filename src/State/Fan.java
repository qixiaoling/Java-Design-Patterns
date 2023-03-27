package State;

public class Fan {
    State fanOffState;
    State fanLowState;
    State fanMedState;

    State state;

    public Fan(){
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMedState = new FanMedState(this);
        //second set the state (the one can change) to be fanOffState
        state = fanOffState;
    }

    public void pullChain() {
        state.handleRequest();
    }
    public String toString() {
        return state.toString();
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public State getFanLowState(){
        return fanLowState;
    }
    public State getFanMedState(){
        return fanMedState;
    }
    public void setState(State state) {
        this.state = state;
    }
}
