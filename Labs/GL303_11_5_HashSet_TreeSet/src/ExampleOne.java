import java.util.HashSet;

public class ExampleOne {
    public void createSet(){
        HashSet<Integer> evenNumber = new HashSet<>();
        //Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber); //Output: HashSet: [2, 4, 6]

        HashSet<Integer> numbers = new HashSet<>();
        //using addAll
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers); // Output: New HashSet: [2, 4, 5, 6]
    }
}

