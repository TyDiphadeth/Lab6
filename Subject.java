package Lab6;



public class Subject {

    // Constant (does not change)
    public static final int YEAR_LEVEL = 2;

    // Static variable initialized in static block
    private static final int MAX_STUDENTS;

    static {
        MAX_STUDENTS = 35;
    }

    // Instance variables
    private String courseCode;
    private String courseName;
    private int courseHours;

    // Constructor
    public Subject(String courseCode, String courseName, int courseHours)throws Exception {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseHours = courseHours;
    }

    // Getter for static variable
    public static int getMaxStudents() {
        return MAX_STUDENTS;
    }

    // Getters
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditHours() {
        return courseHours;
    }
    public void  setName(String name) throws Exception{
    	if(name==null||name.isEmpty()) {
    		throw new Exception ("Name cannot be empty");
    	}
    	this.courseName=name;
    }
}

