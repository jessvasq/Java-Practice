import java.util.TreeMap;

public class ExampleTreeMapOne {
    public void removeTreeElements(){
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap: " + numbers);

        //using remove() method with one parameter
        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);

        // using remove() method with two parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry {Three=3} removed? " + result);
        System.out.println("Updated TreeMap: " + numbers);

    }
}
