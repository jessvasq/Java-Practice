import java.util.TreeMap;

public class ExampleTreeMapTwo {
    public void treeMapMethods(){
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        System.out.println("TreeMap: " + numbers);

        // Using the firstKey() method, returns the first key of the map
        String firstKey = numbers.firstKey();
        System.out.println("First Key: " + firstKey);

        // Using the lastKey() method, returns the key/value mapping of the first key of the map
        String lastKey = numbers.lastKey();
        System.out.println("Last Key: " + lastKey);

        // Using firstEntry() method, returns the last key of the map
        System.out.println("First Entry: " + numbers.firstEntry());

        // Using the lastEntry() method, returns the key/value mapping of the last key of the map
        System.out.println("Last Entry: " + numbers.lastEntry());

    }
}
