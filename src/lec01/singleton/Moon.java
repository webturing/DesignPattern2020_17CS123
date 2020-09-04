package lec01.singleton;

public class Moon {
    private Moon() {
        //初始化
    }

    private static Moon instance = new Moon();

    static {
        //初始化2
    }

    public static Moon getInstance() {
        return instance;
    }
}
