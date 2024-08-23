public class RemoteControl {
    private static Command[] onCommands = new Command[0];
    private final Command[] offCommands;
    private static Command lastLevelCommand;
    private Command offCommand;


    public RemoteControl(int slots) {
        onCommands = new Command[slots];
        offCommands = new Command[slots];
        lastLevelCommand = null;





    }

    public void setCommand(int slot, Command onCommand, Command OffCommand) {
        onCommands[slot] = onCommand;

        Command offCommand = null;
        offCommands[slot] = null;

    }

    public static void onButtonWasPressed(int slot) {
        if (onCommands[slot] != null) {
            onCommands[slot].execute();
            lastLevelCommand = onCommands[slot];
        }
    }

    public void offButtonWasPressed(int slot) {
        if (offCommands[slot] != null) {
            offCommands[slot].execute();
            lastLevelCommand = offCommands[slot];
        }
    }

    public void UndoButtonWasPressed() {
        if (lastLevelCommand != null) {
            lastLevelCommand.Undo();
        }
    }


}