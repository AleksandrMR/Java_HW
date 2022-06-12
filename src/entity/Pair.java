package entity;

public class Pair {
    int a = 1;
    int b = 2;

    public void printValues() {
        System.out.println("a: " + a + ", b: " + b);
    }

    public void changeValues(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("a: " + a + ", b: " + b);
    }

    public int sum() {
        int mySum = a + b;
        System.out.println("Sum a + b = " + mySum);
        return mySum;
    }

    public int bestValue() {
        int bigNumber;
        if (a > b) {
            bigNumber = a;
        } else {
            bigNumber = b;
        }
        System.out.println("The biggest number of A and B is " + bigNumber);
        return bigNumber;
    }
}
