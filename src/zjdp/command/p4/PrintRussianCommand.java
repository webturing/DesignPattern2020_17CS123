package zjdp.command.p4;

public class PrintRussianCommand implements Command {
    PrintLetter letter;

    PrintRussianCommand(PrintLetter letter) {
        this.letter = letter;
    }

    public void execute() {
        letter.printRussian();
    }
}
