package lec03.builder.p2;

import javax.swing.*;

public interface Builder {
    void buildButton();

    void buildLabel();

    void buildTextField();

    JPanel getPanel();
}
