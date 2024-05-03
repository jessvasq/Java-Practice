import java.util.LinkedList;

public class LinkedListExample {

    public void createLinkedList() {
        //Linked List declaration
        LinkedList<String> linkedListEX = new LinkedList<String>();

        //Adding elements to the linked list
        System.out.println("original linked list: " + linkedListEX);
        linkedListEX.add("Item1");
        linkedListEX.add("Item5");
        linkedListEX.add("Item3");
        linkedListEX.add("Item6");
        linkedListEX.add("Item2");

        System.out.println("linkedListEX: " + linkedListEX);

        /*Add First and Last Element*/
        linkedListEX.addFirst("First Item");
        linkedListEX.addLast("Last Item");
        System.out.println("LinkedList Content after addition: " + linkedListEX); //LinkedList Content after addition: [First Item, Item1, Item5, Item3, Item6, Item2, Last Item]

        /*This is how to get and set Values*/
        Object firstVar = linkedListEX.get(0);
        System.out.println("first variable: " + firstVar);
        linkedListEX.set(0, "Changed first Item");
        Object firstVar2 = linkedListEX.get(0);
        System.out.println("First element after update by set method: " +firstVar2);

        //Remove first and last element
        linkedListEX.removeFirst();
        linkedListEX.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " + linkedListEX);


        /* Add to a Position and remove from a position */
        linkedListEX.add(0, "Newly added item"); //add at index 0
        linkedListEX.remove(2);
        System.out.println("Final Content: " + linkedListEX);// Output: Final Content: [Newly added item, Item1, Item3, Item6, Item2]


    }
}
