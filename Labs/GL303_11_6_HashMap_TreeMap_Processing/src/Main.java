public class Main {
    public static void main(String[] args) {
        // ----- Remove HashMap Elements -----\\
        ExampleOneHashMap obj = new ExampleOneHashMap();
        obj.createHashMap();

        // ----- Create Hashmap and Remove HashMap Elements ----- \\
        ExampleTwoHashMap obj2 = new ExampleTwoHashMap();
        obj2.hashMapMethods();

        // -----  Remove TeeMap Elements ----- \\
        ExampleTreeMapOne obj3 = new ExampleTreeMapOne();
        obj3.removeTreeElements();

        // ----- Methods for Navigation ----- \\
        ExampleTreeMapTwo obj4 = new ExampleTreeMapTwo();
        obj4.treeMapMethods();

        // ----- TreeMap Comparator ----- \\
        CustomComparator obj5 = new CustomComparator();
        obj5.useCustomComparator();

    }
}