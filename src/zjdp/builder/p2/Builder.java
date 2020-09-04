﻿package zjdp.builder.p2;

import javax.swing.JPanel;

public interface Builder {
    public abstract void buildButton();

    public abstract void buildLabel();

    public abstract void buildTextField();

    public abstract JPanel getPanel();
}
