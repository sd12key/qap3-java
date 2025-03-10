package Task1;

class Student extends Person {
    protected String id; 
    protected double gpa;

    // constructor
    public Student(String name, int age, String gender, String id, double gpa) {
        super(name, age, gender); // Call the superclass (Person) constructor
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
