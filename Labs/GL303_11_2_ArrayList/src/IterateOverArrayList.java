/* We can iterate over an arrayList using:
 * Iterator
 * Iterator() and forEachRemaining()
 * listIterator()
 * Simple for loop
 * Enhanced for loop */
import java.util.*;

public class IterateOverArrayList {
    public void iterateOverArrayList() {
        List<String> tvShows = new ArrayList<>();
        tvShows.add("Breaking Bad");
        tvShows.add("Game Of Thrones");
        tvShows.add("Friends");
        tvShows.add("Prison break");

        System.out.println("\n=== Iterate using an iterator() ===");
        Iterator<String> tvShowItr = tvShows.iterator();
        while (tvShowItr.hasNext()) {
            String tvShow = tvShowItr.next();
            System.out.println(tvShow);
        }

        System.out.println("==Iterate using an iterator() and forEachRemaining() method ===");
        tvShowItr = tvShows.iterator();
        tvShowItr.forEachRemaining(tvShow -> System.out.println(tvShow));

        System.out.println("\n=== Iterate using simple for-each loop ===");
        for (String tvShow : tvShows) {
            System.out.println(tvShow);
        }

        System.out.println("\n=== Iterate using for loop with index ===");
        for (int i=0; i<tvShows.size(); i++){
            System.out.println(tvShows.get(i));
        }

        System.out.println("\n=== Iterate iterator ===");
        ListIterator lIterator = tvShows.listIterator();
        System.out.println("Elements in forward direction, ascending order");


        System.out.println("\n====== Iterate using while loop=======");
        while (lIterator.hasNext()) {
            String tvShow = (String) lIterator.next();
            System.out.println(tvShow);
        }

        System.out.println("=========Elements in backward direction, descending order ======");

        while (lIterator.hasPrevious())
        {
            System.out.println(lIterator.previous());
        }
    }
}
