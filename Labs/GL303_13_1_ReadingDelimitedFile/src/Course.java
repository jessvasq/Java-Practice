public class Course {
    private String code, courseName, instructorName;

    public Course(String code, String courseName, String instructorName) {
        this.code = code;
        this.courseName = courseName;
        this.instructorName = instructorName;
    }

    public Course(){}

    //Setters and getters

    public String getCode() {
        return code;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
}
