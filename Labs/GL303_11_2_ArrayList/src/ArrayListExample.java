import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    /* An ArrayList is a dynamic array(resizable array). It grows its size to accommodate new elements, and shrinks its size when elements are removed.
- An ArrayList internally uses an array to store the elements. Just like arrays, retrieves elements by index.
- Allows for duplicate and null values.
- Ordered collection, and maintains the insertion order of the elements.
- Cannot create an ArrayList of primitive types such as int, char, etc.; you need to use boxed types such as Integer, Character, Boolean, etc.
*/

    public void arrayListExample() {
        //creating an ArrayList of string. List is an interface and ArrayList is a class that implements the 'List' interface
        List<String> animals = new ArrayList<>();

        //Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);
        // Adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");
        System.out.println(animals); // Output: [Lion, Tiger, Elephant, Cat, Dog]
    }

}
