﻿package zjdp.builder.p2;

import javax.swing.JPanel;

public class Director {
    private Builder builder;

    Director(Builder builder) {
        this.builder = builder;
    }

    public JPanel constructProduct() {
        builder.buildButton();
        builder.buildLabel();
        builder.buildTextField();
        JPanel product = builder.getPanel();
        return product;
    }
}
