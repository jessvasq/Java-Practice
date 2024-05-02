//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Initialize the class with Integer data
        DemoClass obj = new DemoClass();
        //pass Integer
        obj.genericsMethod(25);
        //pass String
        obj.genericsMethod("Per Scholas");
        //Pass Float
        obj.genericsMethod(54.3f);
        //pass char
        obj.genericsMethod('C');

        //Initialize generic class with String and Integer data
        GMultipleDataType<String, Integer> mObj = new GMultipleDataType<>("Per Scholas", 11025);
        System.out.println(mObj.getValueOne());
        System.out.println(mObj.getValueTwo());

        // initialize generic class with String and String data
        GMultipleDataType<String, String> mObj2 = new GMultipleDataType<>("Per Scholas", "Non-Profit");
        System.out.println(mObj2.getValueOne());
        System.out.println(mObj2.getValueTwo());

    }
}