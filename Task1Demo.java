import Task1.Person;
import Task1.Student;
import Task1.CollegeStudent;
import Task1.Teacher;

public class Task1Demo {
    public static void main(String[] args) {
        Person bob = new Person("Coach Bob", 27, "M");
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        Teacher mr_java = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(bob);
        System.out.println(lynne);  
        System.out.println(mr_java);
        System.out.println(ima);
    }
}
