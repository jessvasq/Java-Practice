import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ----- Creating an ArrayList and Adding New Elements -----\\
        ArrayListExample arrList = new ArrayListExample();
        arrList.arrayListExample();

        // ----- Creating an ArrayList From Another Collection -----\\
        CreateArrayListFromCollectionExample arrList1 = new CreateArrayListFromCollectionExample();
        arrList1.createArr();

        //----- Accessing Elements from an ArrayList -----\\
        CreateArrayListFromCollectionEx arrList2 = new CreateArrayListFromCollectionEx();
        arrList2.createArrayList();

        // ----- Removing Elements from an ArrayList ----- \\
        RemoveElementsFromArrayList arrList3 = new RemoveElementsFromArrayList();
        arrList3.createArrList();

        // ----- Iterate over Array List ----- \\
        IterateOverArrayList arrList4 = new IterateOverArrayList();
        arrList4.iterateOverArrayList();

        // ----- Searching for Elements in an ArrayList ----- \\
        SearchElementsInArrayListExample arrList5 = new SearchElementsInArrayListExample();
        arrList5.searchElementsInArr();
    }
}