import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        homeWork1();
        homeWork2();
    }

    public static void hw1Ex1() {
        int myInt = 12312;
        int count = String.valueOf(myInt).length();

        if (myInt < 0) {
            System.out.println("hw1=============Ex1:\n" + "This number has" + count + "digits and is negative");
        } else {
            System.out.println("hw1=============Ex1:\n" + "This number has " + count + " digits and is positive");
        }
    }

    public static void hw1Ex2() {
        int a = 0;
        int b = 0;
        int c = 0;

        if ((a + b) > c) {
            System.out.println("hw1=============Ex2:\n" + "Triangle exists");
        } else if ((a + c) > b) {
            System.out.println("hw1=============Ex2:\n" + "Triangle exists");
        } else if ((b + c) > a) {
            System.out.println("hw1=============Ex2:\n" + "Triangle exists");
        } else {
            System.out.println("hw1=============Ex2:\n" + "Triangle does not exist");
        }
    }

    public static void hw1Ex3() {
        int someInt = 2;

        if (someInt > 0) {
            someInt += 1;
        } else if (someInt < 0) {
            someInt -= 2;
        } else if (someInt == 0) {
            someInt = 10;
        }
        System.out.println("hw1=============Ex3:\n" + someInt);
    }

    public static void hw1Ex4() {
        int a = -1;
        int b = 0;
        int c = 2;
        int countPositiveNumbers = 0;

        if (a >= 0) {
            countPositiveNumbers += 1;
        }
        if (b >= 0) {
            countPositiveNumbers += 1;
        }
        if (c >= 0) {
            countPositiveNumbers += 1;
        }
        System.out.println("hw1=============Ex4:\n" + countPositiveNumbers);
    }

    public static void hw1Ex5() {
        int a = -1;
        int b = 0;
        int c = 2;
        int countPositiveNumbers = 0;
        int countNegativeNumbers = 0;

        if (a >= 0) {
            countPositiveNumbers += 1;
        } else {
            countNegativeNumbers += 1;
        }
        if (b >= 0) {
            countPositiveNumbers += 1;
        } else {
            countNegativeNumbers += 1;
        }
        if (c >= 0) {
            countPositiveNumbers += 1;
        } else {
            countNegativeNumbers += 1;
        }
        System.out.println("hw1=============Ex5:\n" + "PositiveNumbersCount - " + countPositiveNumbers);
        System.out.println("NegativeNumbersCount - " + countNegativeNumbers);
    }

    public static void hw1Ex6() {
        int a = 1;
        int b = 2;

        if (a > b) {
            System.out.println("hw1=============Ex6:\n" + a);
        } else {
            System.out.println("hw1=============Ex6:\n" + b);
        }
    }

    public static void hw1Ex7() {
        int progNumber = 32;
        int endDigit = (progNumber % 10);
        String strEnd = "";
        String strPrint = progNumber + " программист";

        if (endDigit > 1) {
            strEnd = "а";
        }

        if (endDigit >= 5) {
            strEnd = "ов";
        }
        System.out.println("hw1=============Ex7:\n" + strPrint + strEnd);
    }

    public static void homeWork1() {
        hw1Ex1();
        hw1Ex2();
        hw1Ex3();
        hw1Ex4();
        hw1Ex5();
        hw1Ex6();
        hw1Ex7();
    }

    // =================================================================== HW2 ===

    public static void hw2Ex1() {
        System.out.println("hw2=============Ex1:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void hw2Ex2() {
        System.out.println("hw2=============Ex2:");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void hw2Ex3() {
        System.out.println("hw2=============Ex3:");
        int a = 5;
        for (int i = 1; i <= 10; i++) {
            int b = a * i;
            System.out.println(a + " * " + i + " = " + b);
        }
    }

    public static void hw2Ex4(int a) {
        System.out.println("hw2=============Ex4:");
        int someSum = 0;
        for (int i = 1; i <= a; i++) {
            someSum += i;
        }
        System.out.println(someSum);
    }

    public static void hw2Ex5() {
        System.out.println("hw2=============Ex5:");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }

        int i = 0;
        while (i < 98) {
            i += 7;
            System.out.println(i);
        }
    }

    public static void hw2Ex6() {
        System.out.println("hw2=============Ex6:");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        int i = 1;
        while (i < 512) {
            i = i * 2;
            System.out.println(i);
        }
    }

    public static void hw2Ex6L() {
        System.out.println("hw2=============Ex6L:");
        int a = 2;
        int b = 100;

        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }

    public static void hw2Ex7L() {
        System.out.println("hw2=============Ex7L:");
        int a = 99;
        int someSum = 0;

        for (int i = 1; i <= a; i++) {
            if (i % 2 != 0) {
                someSum += i;
            }
        }
        System.out.println(someSum);
    }

    public static void hw2Ex5L() {
        System.out.println("hw2=============Ex5L:");
        double inch = 2.54;

        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " cm " + "= " + i * inch + " inch");
        }
    }

    public static void hw2Ex4L() {
        System.out.println("hw2=============Ex4L:");
        int a = 6;
        int b = 5;
        int sum = 0;

        for(int i = 1; i <= a; i++) {
            sum += b;
        }
        System.out.println(sum);
    }

    public static void hw2Ex3L() {
        System.out.println("hw2=============Ex3L:");
        int sum = 0;
        for (int i = 1; i <= 256; i = i * 2) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void hw2Ex2L() {
        System.out.println("hw2=============Ex2L:");
        int sumCell = 0;
        for (int i = 3; i <= 24; i = i + 3) {
            sumCell += 2;
        }
        System.out.println(sumCell);
    }

    public static void hw2Ex1L() {
        System.out.println("hw2=============Ex1L:");
        double sumKm = 10;
        for (int i = 2; i <= 7; i++) {
            sumKm += (sumKm / 100) * 10;
        }
        System.out.println("Sum of kilometers run in seven days: " + sumKm + " km");
    }

    public static void hw2Ex8L() {
        System.out.println("hw2=============Ex8L:");
        String star = "* ";
        String stars = "";
        for (int i = 1; i <= 4; i++) {
            stars += star;
            System.out.println(stars);
        }
        for (int i = 4; i >= 1; i--) {
            stars = stars.substring(0, stars.length() - 2);
                System.out.println(stars);
        }
    }

    public static void homeWork2() {
        hw2Ex1();
        hw2Ex2();
        hw2Ex3();
        hw2Ex4(5);
        hw2Ex5();
        hw2Ex6();

        hw2Ex6L();
        hw2Ex7L();
        hw2Ex5L();
        hw2Ex4L();
        hw2Ex3L();
        hw2Ex2L();
        hw2Ex1L();
        hw2Ex8L();
    }
}
