package Command.after;

public class DivideCommand implements Command{

    private int valueToDivide;

    public DivideCommand(int valueToDivide) {
        this.valueToDivide = valueToDivide;
    }

    @Override
    public int execute(int currentValue) {
        return currentValue / this.valueToDivide;
    }

    @Override
    public int undo(int currentValue) {
        return currentValue * this.valueToDivide;
    }
}
