import java.util.HashSet;

public class ExampleTwo {
    public void createsSetTwo() {
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(2);
        System.out.println("HashSet1: " + evenNumbers);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        System.out.println("HashSet2: " + numbers);

        // Union of two sets, combines both sets removing duplicates
        numbers.addAll(evenNumbers);
        System.out.println("Union is: " + numbers);

    }
}
