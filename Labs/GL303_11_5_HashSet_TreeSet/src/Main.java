import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // ------  Insert Elements to HashSet using addAll() ----- \\
        ExampleOne set1 = new ExampleOne();
        //set1.createSet();

        // ----- Union of Sets ----- \\
        ExampleTwo set2 = new ExampleTwo();
        //set2.createsSetTwo();

        // ----- Difference Between Sets ----- \\
        ExampleThree set3 = new ExampleThree();
        //set3.differenceBtwSets();

        // ----- Enhanced for() Loop ----- \\
        ExampleFour set4 = new ExampleFour();
        //set4.useEnhancedLoop();

        // ----- Iterate Through TreeSet ----- \\
        TreeSetExample set5 = new TreeSetExample();
        //set5.useIteratorTreeSet();

        // ----- Remove Elements ----- \\
        TreeSetExampleTwo set6 = new TreeSetExampleTwo();
        //set6.removeElementSet();

        // ----- Methods for Navigation ----- \\
        TreeSetExampleThree set7 = new TreeSetExampleThree();
        //set7.useNavigationSet();

        // ----- Sort TreeSet alphabetically in reverse order
        // Create a TreeSet with user-defined comparator
        TreeSet<String> cities = new TreeSet<String>(new CitiesComparator());
        //add elements to the comparator
        cities.add("UAE");
        cities.add("Mumbai");
        cities.add("NewYork");
        cities.add("Hyderabad");
        cities.add("Karachi");
        cities.add("Xanadu");
        cities.add("Lahore");
        cities.add("Zagazig");
        cities.add("Yingkou");

        //print the contents of TreeSet
        System.out.println("TreeSet: " + cities);

    }
}