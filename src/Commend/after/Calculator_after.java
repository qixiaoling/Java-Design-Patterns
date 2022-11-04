package Commend.after;

import java.lang.reflect.Array;
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
        Command command = this.history.remove(0);
        this.value = command.undo(this.value);
        //the last operation command, please do an undo function of that particular command.
    }

    public static void main(String[] args) {
        Calculator_after calculator_after_1 = new Calculator_after();
        calculator_after_1.executeCommand(new AddCommand(10));
        System.out.println(calculator_after_1.value);
        calculator_after_1.executeUndo();
        System.out.println(calculator_after_1.value);

        Calculator_after calculator_after_2 = new Calculator_after();
        calculator_after_2.executeCommand(new AddThenMultiplyCommand(1, 2));
        System.out.println(calculator_after_2.value);
        calculator_after_2.executeUndo();
        System.out.println(calculator_after_2.value);
    }



}
