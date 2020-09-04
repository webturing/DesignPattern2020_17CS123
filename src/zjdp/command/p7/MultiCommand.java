package zjdp.command.p7;

public class MultiCommand implements Command {
    ShowMultForm showMultForm;

    MultiCommand(ShowMultForm showMultForm) {
        this.showMultForm = showMultForm;
    }

    public void execute() {
        showMultForm.show();
    }

    public String getName() {
        return "显示乘法表";
    }
}
