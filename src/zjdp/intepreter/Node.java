﻿package zjdp.intepreter;

public interface Node {
    public void parse(Context text);

    public void execute();
}