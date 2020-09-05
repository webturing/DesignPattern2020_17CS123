package lec02.factory.p01.better;

public class Factory {
    public static Fruit createFruit(String string) {
        if (string.trim().equalsIgnoreCase("Apple")) return new Apple();
        if (string.trim().equalsIgnoreCase("Orange")) return new Orange();
        if (string.trim().equalsIgnoreCase("Kiwi")) return new Kiwi();
        return null;
    }
}
