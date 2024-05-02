import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveElementsFromArrayList {

    public void createArrList() {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial List: " + programmingLanguages);//Output: Initial List: [C, C++, Java, Kotlin, Python, Perl, Ruby]

        // Remove the element at index `5`
        programmingLanguages.remove(5);
        System.out.println("After remove(5): " + programmingLanguages);  //Output: After remove(5): [C, C++, Java, Kotlin, Python, Ruby]

        //Remove the first occurrence of the given element from the ArrayList
        //(The remove() method returns false if the element does not exist in the ArrayList)
        programmingLanguages.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\"): " + programmingLanguages); //Output:After remove("Kotlin"): [C, C++, Java, Python, Ruby]

        // Remove all the elements that exist in a given collection
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");

        //remove all scripting languages from programming Languages
        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages): " + programmingLanguages); //Output: After removeAll(scriptingLanguages): [C, C++, Java]

        //Remove all elements from the ArrayList
//        programmingLanguages.clear();
//        System.out.println("After clear(): " + programmingLanguages);

    }
}
