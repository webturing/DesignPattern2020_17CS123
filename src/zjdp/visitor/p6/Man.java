﻿package zjdp.visitor.p6;

public class Man extends Person {
    String name;
    double stature;       //身高
    double eyeSight;        //视力

    Man(String name, double stature, double eyeSight) {
        this.name = name;
        this.stature = stature;
        this.eyeSight = eyeSight;
    }

    public double getStature() {
        return stature;
    }

    public double getEyeSight() {
        return eyeSight;
    }

    public String getName() {
        return name;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
