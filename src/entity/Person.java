package entity;

public class Person {
    public String fullName = "somePerson";
    public int age;

    public Person() { }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void talk() {
        System.out.println("I am " + fullName + " and can speak");
    }

    public void move() {
        System.out.println("I am " + fullName + " and can run");
    }
}
