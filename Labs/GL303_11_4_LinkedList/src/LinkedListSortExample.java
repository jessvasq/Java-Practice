import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSortExample {

    public void createSortedList() {
        //create linked list
        LinkedList<String> linkedListEx = new LinkedList<>();
        linkedListEx.add("A");
        linkedListEx.add("C");
        linkedListEx.add("B");
        linkedListEx.add("D");

        //Unsorted
        System.out.println(linkedListEx);
        //Sort the list
        Collections.sort(linkedListEx);
        System.out.println(linkedListEx);

        //Custom sorting
        Collections.sort(linkedListEx, Collections.reverseOrder());

        //Custom sorted
        System.out.println(linkedListEx);

    }

}
