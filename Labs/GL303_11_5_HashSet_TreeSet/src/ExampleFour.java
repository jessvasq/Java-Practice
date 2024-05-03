import java.util.HashSet;

public class ExampleFour {
    public void useEnhancedLoop(){
        //HashSet Declaration
        HashSet <String> hSet = new HashSet<String>();
        // Adding elements to the HashSet
        hSet.add("Apple");
        hSet.add("Mango");
        hSet.add("Grapes");
        hSet.add("Orange");
        hSet.add("Fig");

        //Addition of duplicate elements. These will be deleted in the set, since there are no duplicates in a set
        hSet.add("Apple");
        hSet.add("Mango");

        //Addition of null values
        hSet.add(null);
        hSet.add(null);

        //Iterate through the set
        for(String str : hSet){
            System.out.println(" ---> " + str);
        }
    }
}
