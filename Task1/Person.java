package Task1;

public class Person {
    private String name;
    private int age;
    private String gender;

    // constructor
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // toString()
    @Override
    public String toString() {
        return this.name + ", age: " + this.age + ", gender: " + this.gender;
    }
}
