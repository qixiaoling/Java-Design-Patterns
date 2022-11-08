package Command.after;

public class AddCommand implements Command{

    private int valueToAdd;//10

    public AddCommand(int valueToAdd) {
        this.valueToAdd = valueToAdd;
    }

    @Override
    public int execute(int currentValue) { //0
        return currentValue + this.valueToAdd;
    }

    @Override
    public int undo(int currentValue) {
        return currentValue - this.valueToAdd;
    }

    public static void main(String[] args) {
        Command command = new AddCommand(10);
        int newValue = command.execute(0);
        System.out.println(command.undo(newValue));

    }
}
