import java.util.HashMap;

public class ExampleOneHashMap {
    public void createHashMap() {
        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        languages.put(4, "C Sharp");

        System.out.println("Hashmap: " + languages);

        // remove() method takes the key as its parameter. It then returns the value associated with the key and removes the entry.
        String value = languages.remove(2);
        System.out.println("Hashmap: " + value);
        System.out.println("Hashmap: " + languages);
        String value1 = languages.replace(4, "Python"); //this will not be removed because the key and value do not match the key,value at index 4
        System.out.println(languages);
    }
}
