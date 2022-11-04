package Command.after;

public class SubtractCommand implements Command{

    private int valueToSubtract;

    public SubtractCommand(int valueToSubtract) {
        this.valueToSubtract = valueToSubtract;
    }

    @Override
    public int execute(int currentValue) {
        return currentValue - this.valueToSubtract;
    }

    @Override
    public int undo(int currentValue) {
        return currentValue + this.valueToSubtract;
    }
}
