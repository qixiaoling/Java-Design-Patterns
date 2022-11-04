package Command.after;

public class MultiplyCommand implements Command{

    private int valueToMultiply;

    public MultiplyCommand(int valueToMultiply) {
        this.valueToMultiply = valueToMultiply;
    }

    @Override
    public int execute(int currentValue) {
        return currentValue * this.valueToMultiply;
    }

    @Override
    public int undo(int currentValue) {
        return currentValue / this.valueToMultiply;
    }
}
