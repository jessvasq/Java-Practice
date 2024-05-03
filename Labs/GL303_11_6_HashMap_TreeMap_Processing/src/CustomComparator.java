/*TreeMap elements are sorted in ascending order. However, we can also customize the ordering of keys by creating our comparator class */
import java.util.Comparator;
import java.util.TreeMap;

public class CustomComparator implements Comparator<String>
{
    @Override
    public int compare(String number1, String number2){
        int value = number1.compareTo(number2);

        //Sort in reverse order
        if(value > 0) {
            return -1;
        } else if (value < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public void useCustomComparator(){
        //Create a treeMap with a customized comparator
        TreeMap<String, Integer> numbers = new TreeMap<>(new CustomComparator());
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        numbers.put("Fourth", 4);
        System.out.println("TreeMap: " + numbers);
    }
}
