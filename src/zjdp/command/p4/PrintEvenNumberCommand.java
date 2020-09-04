package zjdp.command.p4;

public class PrintEvenNumberCommand implements Command {
    PrintNumber number;

    PrintEvenNumberCommand(PrintNumber number) {
        this.number = number;
    }

    public void execute() {
        number.printEvenNumber();
    }
}
