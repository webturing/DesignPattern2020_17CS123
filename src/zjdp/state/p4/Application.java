﻿package zjdp.state.p4;

public class Application {
    public static void main(String args[]) {
        Vehicle carOne = new Vehicle("卧铺车厢");
        Vehicle carTwo = new Vehicle("普通车厢");
        carOne.startUp();
        carTwo.startUp();
        carTwo.stop();
        carOne.stop();
    }
}
