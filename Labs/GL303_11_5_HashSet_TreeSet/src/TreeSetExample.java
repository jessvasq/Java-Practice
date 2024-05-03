/* We traverse through the TreeSet by declaring an Iterator for the TreeSet, and then use that Iterator to access each element. Use the next() returns the next element in the TreeSet. */
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetExample {
    public void useIteratorTreeSet() {
        TreeSet<Integer> numTreeSet = new TreeSet<>();
        numTreeSet.add(20);
        numTreeSet.add(5);
        numTreeSet.add(15);
        numTreeSet.add(25);
        numTreeSet.add(10);

        //Call iterator() method to define Iterator for TreeSet
        Iterator<Integer> iteratorSet = numTreeSet.iterator();
        System.out.println("Using TreeSet: ");

        while (iteratorSet.hasNext()) {
            System.out.print(iteratorSet.next());
            System.out.print(", ");
        }
    }
}
