package lec01.singleton;

public class Moon implements Comparable<Moon> {
    private Moon() {
        // this.setWeight(99999);
        System.out.println("AAAAAAAAAAAAAAA");
    }

    private static Moon instance = new Moon();

    static {
        System.out.println("BBBBBBBBBBBBBBBBBB");
    }

    static Moon getInstance() {
        return instance;
    }

    @Override
    public int compareTo(Moon o) {
        return 0;
    }
}
