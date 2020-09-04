package zjdp.command.p4;

public class PrintLetter {
    public void printEnglish() {
        for (char c = 'a'; c <= 'z'; c++)
            System.out.print(" " + c);
    }

    public void printRussian() {
        for (char c = '��'; c <= '��' + 32; c++)
            System.out.print(" " + c);
    }
}
