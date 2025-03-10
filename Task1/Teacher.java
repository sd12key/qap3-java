package Task1;

class Teacher extends Person {
    private double salary;
    private String subject; 

    public Teacher(String name, int age, String gender, double salary, String subject) {
        super(name, age, gender);
        this.salary = salary;
        this.subject = subject;
    }

    // getters
    public double getSalary() {
        return this.salary;
    }

    public String getSubject() {
        return this.subject;
    }

    // setters
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary: " + String.format("%.2f", this.salary) + ", subject: " + this.subject;
    }
}
