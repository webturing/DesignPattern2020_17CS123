package lec01.singleton2;

public class Moon {
    private Moon() {
        // this.setWeight(99999);
        System.out.println("AAAAAAAAAAAAAAA");
    }

    private static Moon instance = null;

    public synchronized static Moon getInstance() {
        if (instance == null) {
            instance = new Moon();
        }


        return instance;
    }
}
