package zjdp.command.p4;

public class PrintEnglishCommand implements Command {
    PrintLetter letter;

    PrintEnglishCommand(PrintLetter letter) {
        this.letter = letter;
    }

    public void execute() {
        letter.printEnglish();
    }
}
