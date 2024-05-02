import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionEx {
    public void createArrayList(){
    List <String> topCompanies = new ArrayList <>();

    //Check if array is empty
     System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());
     topCompanies.add("Google");
     topCompanies.add("Apple");
     topCompanies.add("Microsoft");
     topCompanies.add("Amazon");
     topCompanies.add("Facebook");


     // Find the size of an ArrayList
        System.out.println("Here are the top " + topCompanies.size() + " companies in the world");
        // Retrieve the element at a given index using get()
        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() - 1); //returns last element

        System.out.println("Best Company: " + bestCompany);
        System.out.println("Second Best Company: " + secondBestCompany);
        System.out.println("Last Company in the list: " + lastCompany);

        // Modify the element at a given index using set()
        topCompanies.set(4, "Walmart");
        System.out.println("Modified top companies list: " + topCompanies); //[Google, Apple, Microsoft, Amazon, Walmart]
    }
}

