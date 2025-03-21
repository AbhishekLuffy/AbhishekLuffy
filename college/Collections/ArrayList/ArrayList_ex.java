package Collections.ArrayList;

import java.util.ArrayList;

public class ArrayList_ex {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.set(4, 100);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.contains(30));
    }
}
