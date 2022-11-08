package Command.after;

import java.util.ArrayList;
import java.util.List;

public class Calculator_after {

    private int value = 100;
    private List<Command> history = new ArrayList<>();

    public Calculator_after() {
    }

    public void executeCommand (Command command) {
        this.value = command.execute(this.value);
        this.history.add(command);
        //record what was the last operation
    }

    public void executeUndo() {
        Command command = this.history.remove(history.size()-1);
        this.value = command.undo(this.value);
        //the last operation command, please do an undo function of that particular command.
    }

    public static void main(String[] args) {
        Calculator_after calculator_after = new Calculator_after();
        calculator_after.executeCommand(new AddCommand(10));
        System.out.println(calculator_after.value);
        calculator_after.executeUndo();
        System.out.println(calculator_after.value);

        Calculator_after calculator_after_chained = new Calculator_after();
        calculator_after_chained.executeCommand(new AddThenMultiplyCommand(1, 2));
        System.out.println(calculator_after_chained.value);
        calculator_after_chained.executeUndo();
        System.out.println(calculator_after_chained.value);
    }



}
