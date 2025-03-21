package Collections.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(null, 1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        ArrayList<Integer> result = new ArrayList<>();

        for(Integer num : list1) {
            if(!result.contains(num)) {
                result.add(num);
            }
        }
        for(Integer num : list2) {
            if(!result.contains(num)) {
                result.add(num);
            }
        }
        System.out.println(result);
    }
}
