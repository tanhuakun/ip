package duke.exceptions;

public class InvalidCommandDukeException extends DukeException {
    public InvalidCommandDukeException() {
        super("Command not recognized");
    }
}