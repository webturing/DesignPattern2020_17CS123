package zjdp.command.p3;

public interface Command {
    public abstract void execute(String name);

    public abstract void undo();
}
