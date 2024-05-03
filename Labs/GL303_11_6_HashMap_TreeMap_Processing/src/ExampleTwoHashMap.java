import java.util.HashMap;

public class ExampleTwoHashMap {
    public void hashMapMethods(){
        HashMap<String, String> newHashMap = new HashMap<>();
        //Addition of key and value
        newHashMap.put("Key1", "Lenovo");
        newHashMap.put("Key2", "Motorola");
        newHashMap.put("Key3", "Nokia");
        newHashMap.put("Key4", null);
        newHashMap.put(null, "Sony");
        System.out.println("Original map contains:" + newHashMap);

        //Hashmap size
        System.out.println("Size of original map: " + newHashMap.size());

        //Copy one hashMap to another using putAll()
        HashMap<String, String> copyHashMap = new HashMap<>();
        copyHashMap.putAll(newHashMap);
        System.out.println("copyHashMap mappings= " + copyHashMap);
        //Removal of null key
        String nullKey = null;
        System.out.println("copyHashMap null key value = " + copyHashMap.remove(nullKey));
        System.out.println("copyHashMap after removing null key = " + copyHashMap);
        System.out.println("Size of copyHashMap is:" + copyHashMap.size());

    }

}
