package Collections.HashSet;
import java.util.HashSet;

public class HashSet_Ex {
    public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
    set.add(10);
    set.add(20);
    set.add(30);
    set.add(40);
    set.add(50);
    
    set.remove(30);

    System.out.println(set);
    }
}
