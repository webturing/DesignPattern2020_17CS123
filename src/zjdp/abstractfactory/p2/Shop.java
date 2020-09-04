﻿package zjdp.abstractfactory.p2;

public class Shop {
    UpperClothes cloth;
    Trousers trouser;

    public void giveSuit(ClothesFactory factory, int chestSize, int waistSize, int height) {
        cloth = factory.createUpperClothes(chestSize, height);
        trouser = factory.createTrousers(waistSize, height);
        showMess();
    }

    private void showMess() {
        System.out.println("<套装信息>");
        System.out.println(cloth.getName() + ":");
        System.out.print("胸围:" + cloth.getChestSize());
        System.out.println("身高:" + cloth.getHeight());
        System.out.println(trouser.getName() + ":");
        System.out.print("腰围:" + trouser.getWaistSize());
        System.out.println("身高:" + trouser.getHeight());
    }
}