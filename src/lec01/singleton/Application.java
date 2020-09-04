package lec01.singleton;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Moon chinaMoon = Moon.getInstance();
        Moon usaMoon = Moon.getInstance();
        System.out.println(chinaMoon);
        System.out.println(usaMoon);
        List<Moon> list = new Vector<Moon>();
        Collections.sort(list);
        Comparable<Moon> other = Moon.getInstance();

        LinkedList list1 = new LinkedList();
        Queue<Integer> list2 = new LinkedList<>();
        Deque<Integer> list3 = new LinkedList<>();

    }
}
