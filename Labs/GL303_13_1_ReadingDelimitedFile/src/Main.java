import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ScanDelimiterFile obj = new ScanDelimiterFile();
        obj.readDelimiterdFile();

        ScanDelimiterFileTwo obj1 = new ScanDelimiterFileTwo();
        obj1.readDelimiterFile();
    }
}