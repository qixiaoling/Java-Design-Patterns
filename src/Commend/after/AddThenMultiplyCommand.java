package Commend.after;

public class AddThenMultiplyCommand implements Command{


    private AddCommand addCommand;

    private MultiplyCommand multiplyCommand;

    public AddThenMultiplyCommand(int valueToAdd, int valueToMultiply) {
        addCommand = new AddCommand(valueToAdd);
        multiplyCommand = new MultiplyCommand(valueToMultiply);
    }

    @Override
    public int execute(int currentValue) {
         int newValue = this.addCommand.execute(currentValue);
         return this.multiplyCommand.execute(newValue);
    }

    @Override
    public int undo(int currentValue) {
        int newValue = this.multiplyCommand.undo(currentValue);
        return this.addCommand.undo(newValue);
    }

    public static void main(String[] args) {
        AddThenMultiplyCommand addThenMultiplyCommand = new AddThenMultiplyCommand(1, 2);
        int resultOfThat = addThenMultiplyCommand.execute(10);
        System.out.println(addThenMultiplyCommand.undo(resultOfThat));


    }
}
