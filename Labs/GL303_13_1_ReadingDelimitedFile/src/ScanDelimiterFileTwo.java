import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScanDelimiterFileTwo {
    public void readDelimiterFile() throws FileNotFoundException {
        try{
            String location = "resources/CourseData.csv";
            File file = new File(location);
            Scanner input = new Scanner(file);
            ArrayList<Course> data = new ArrayList<Course>();

            while(input.hasNextLine()) {
                String line = input.nextLine();
                String[] splitedLine = line.split(",");

                Course cObj = new Course();
                cObj.setCode(splitedLine[0]);
                cObj.setCourseName( splitedLine[1]);
                cObj.setInstructorName(splitedLine[2]);

                data.add(cObj);
            }

            for (Course c : data) {
                System.out.println(c.getCode() + " | " + c.getCourseName() + " | " + c.getInstructorName());
                System.out.println("===============================");
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found! ");
            e.printStackTrace();
        }
    }
}
