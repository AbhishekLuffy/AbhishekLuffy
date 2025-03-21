package Collections.LinkedList;
import java.util.LinkedList;

public class LinkedList_Ex {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("list after adding the elements: " +list);

        list.remove(4);
        System.out.println("list after removing the elements from the 4th index: "+list);

       list.addFirst(0);
       System.out.println("adding 0 at the beginning of the list: "+list);

       list.removeFirst();
       System.out.println("list after removing at the beginning: " +list);

       list.removeLast();
       System.out.println("list after removing at the last: " +list);
    }   
    
}
