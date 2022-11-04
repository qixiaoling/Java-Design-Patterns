package Command.after;

public interface Command {

    int execute (int currentValue);

    int undo (int currentValue);
}
