import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {

    public void createArr() {
        //create an ArrayList from another collection using the ArrayList(Collection c) constructor
        List<Integer> firstPrimeNumbers = new ArrayList<>();
        firstPrimeNumbers.add(2);
        firstPrimeNumbers.add(3);
        firstPrimeNumbers.add(5);
        firstPrimeNumbers.add(7);
        firstPrimeNumbers.add(11);

        // Creating an ArrayList from another collection
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstPrimeNumbers);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        //Adding an entire collection to an ArrayList
        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
        System.out.println(firstTenPrimeNumbers); //Output: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
    }
}
