package Task1;

public class Student extends Person {
    private String id; 
    private double gpa;

    // constructor
    public Student(String name, int age, String gender, String id, double gpa) {
        super(name, age, gender); 
        this.id = id;
        this.gpa = gpa;
    }

    // getters
    public String getId() {
        return this.id;
    }

    public double getGpa() {
        return this.gpa;
    }

    // setters
    public void setId(String id) {
        this.id = id;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // toString() 
    @Override
    public String toString() {
        return super.toString() + ", ID: " + this.id + ", GPA: " + String.format("%.1f", this.gpa);
    }
    
}
