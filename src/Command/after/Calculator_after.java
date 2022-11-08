package Command.after;

import java.util.ArrayList;
import java.util.List;

public class Calculator_after {

    private int currentValue = 100;
    private List<Command> history = new ArrayList<>();

    public Calculator_after() {
    }

    public void executeCommand (Command command) {
        this.currentValue = command.execute(this.currentValue);
        this.history.add(command);
    }

    public void executeUndo() {
        Command command = this.history.remove(history.size()-1);
        this.currentValue = command.undo(this.currentValue);
    }

    public static void main(String[] args) {
        Calculator_after calculator_after = new Calculator_after();
        calculator_after.executeCommand(new AddCommand(10));
        System.out.println(calculator_after.currentValue);
        calculator_after.executeUndo();
        System.out.println(calculator_after.currentValue);

        Calculator_after calculator_after_chained = new Calculator_after();
        calculator_after_chained.executeCommand(new AddThenMultiplyCommand(1, 2));
        System.out.println(calculator_after_chained.currentValue);
        calculator_after_chained.executeUndo();
        System.out.println(calculator_after_chained.currentValue);
    }



}
