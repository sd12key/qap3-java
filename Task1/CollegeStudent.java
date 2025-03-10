package Task1;

public class CollegeStudent extends Student {
    private int year;    
    private String major; 

    // constructor
    public CollegeStudent(String name, int age, String gender, String id, double gpa, int year, String major) {
        super(name, age, gender, id, gpa);
        this.year = year;
        this.major = major;
    }

    // getters
    public int getYear() {
        return this.year;
    }

    public String getMajor() {
        return this.major;
    }

    // setters
    public void setYear(int year) {
        this.year = year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() + ", year: " + this.year + ", major: " + this.major;
    } 
}
