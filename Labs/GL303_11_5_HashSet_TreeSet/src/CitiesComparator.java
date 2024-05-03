import java.util.Comparator;

public class CitiesComparator implements Comparator <String>{
    //override compare method to compare two elements of the TreeSet
    //We can sort TreeSet in a customized order by defining a new comparator class

    @Override
    public int compare(String citiesOne, String citiesTwo){
        int value = citiesOne.compareTo(citiesTwo);
        //sort in reverse order
        if (value > 0){
            return -1;
        }else if(value < 0){
            return 1;
        }else{
            return 0;
        }
    }

}
