package entity;

public class Student {
    String firstName;
    int groupNumber;
    int[] values = new int[5];

    public Student() {}
    public Student(String firstName, int groupNumber) {
        this.firstName = firstName;
        this.groupNumber = groupNumber;
    }

    public void changeRate(int index, int to) {
        if (index <= 4) {
            this.values[index] = to;
        } else {
            System.out.println("You have entered an index that does not exist, enter a number from 0 to 4, thank you for your understanding!");
        }
    }

    public void getStudentInfo() {
        System.out.println("Student: " + this.firstName + ", " + "GroupNumber: " + this.groupNumber);
        System.out.println(this.values.toString());
    }
}
