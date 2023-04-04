import entity.*;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        homeWork1();
//        homeWork2();
//        homeWork3();
//        homeWork4();
        homeWork5();
    }

    // =================================================================== HW5 ===

    /*
    1.
    Класс Деньги для работы с денежными суммами.
    Число должно быть представлено двумя полями:
    типа long для рублей и типа int - для копеек.
    Дробная часть (копейки) при выводе на экран должна быть отделена от целой части запятой.
    Реализовать сложение, вычитание, деление сумм, умножение на дробное число и операции сравнения.
    В функции main проверить эти методы.
     */

    public static void homeWork5() {
        hw5Ex1();
    }

    public static void hw5Ex1() {

    }

    // =================================================================== HW4 ===

    public static void homeWork4() {
        hw4Ex1();
        hw4Ex2();
        hw4Ex3();
        hw4Ex4();
        hw4Ex5();
        hw4Ex6();
        hw4Ex7();
    }

    public static void hw4Ex7() {
        String[] myStrings = {
                "String Is",
                "my String Is Long",
                "Very Long",
                "my String Is Very BLong",
                "Is Long"};

        int common = 0;
        for (String s : myStrings) {
            common += s.length();
        }

        int middle = common / myStrings.length;
        StringBuilder strBuilder = new StringBuilder();
        for (String s : myStrings) {
            if (s.length() > middle) {
                strBuilder.append(s);
                System.out.println(strBuilder + " -> " + strBuilder.length());
            }
        }
    }

    public static void hw4Ex6() {
        String[] myStrings = {
                "String Is",
                "my String Is Long",
                "Very Long",
                "my String Is Very BLong",
                "Is Long"};
        for (String line : myStrings) {
            int words = line.split("\s+").length;
            if (words >= 3 && words <= 5) {
                System.out.println(line);
            }
        }
    }

    public static void hw4Ex5() {
        String[] myStrings = {"вдв", "сад", "дед", "книга", "тащат"};
        StringBuilder strBuilder = new StringBuilder();

        for (String item : myStrings) {
            StringBuffer revString = new StringBuffer(item).reverse();
            String strRev = revString.toString();

            if(item.equalsIgnoreCase(strRev)) {
                strBuilder.append(item);
                strBuilder.append(",");
            }
        }
        System.out.println(strBuilder);
    }

    public static void hw4Ex4() {
        String myString = "BLong";
        char myChar0 = myString.charAt(0);
        char myChar3 = myString.charAt(3);
        System.out.println(myString.replace(myChar3, myChar0));
    }

    public static void hw4Ex3() {
        String myString = "my AString Is Very BLong";
        System.out.println(myString.substring(4,19));
    }

    public static void hw4Ex2() {
        String myString = "my String Is Very Long";
        System.out.println(myString.toLowerCase().replace(" ", "_"));
    }

    public static void hw4Ex1() {
        String line1 = "Line1";
        String line2 = "Line2";
        String line3 = "Line3";

        System.out.println(line1.toLowerCase());
        System.out.println(line2.toUpperCase());
        System.out.println(line3);
    }

    // =================================================================== HW3 ===

    public static void homeWork3() {
        hw3Person();
        hw3Pair();
        hw3Calculator();
        hw3Student();
    }

    public static void hw3Student() {
        System.out.println("hw3=============Student:");
        Student mike = new Student("Mike",2);
        Student nike = new Student("Nike",2);
        Student sam = new Student("Sam",2);
        Student[] students = new Student[3];
        students[0] = mike;
        students[1] = nike;
        students[2] = sam;
    }

    public static void hw3Calculator() {
        System.out.println("hw3=============Calculator:");
        Calculator newCalculator = new Calculator();
        Phone myPhone = new Phone("iPhoneSE", "+375294570048", newCalculator);
        newCalculator.doAddition(2,2);
        newCalculator.doSubtraction(2,2);
        newCalculator.doMultiplication(2,2);
        newCalculator.doDivision(4,2);
        newCalculator.doNumberToPower(2,2);
        newCalculator.isEvenNumber(13);
    }

    public static void hw3Pair() {
        System.out.println("hw3=============Pair:");
        Pair pair = new Pair();
        pair.printValues();
        pair.sum();
        pair.bestValue();
        pair.changeValues(11,9);
        pair.sum();
        pair.bestValue();
    }

    public static void hw3Person() {
        System.out.println("hw3=============Person:");
        Person ted = new Person();
        ted.talk();
        ted.move();
        Person sam = new Person("Sam", 22);
        sam.talk();
        sam.move();
    }

    // =================================================================== HW2 ===

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

    // =================================================================== HW1 ===

    public static void homeWork1() {
        hw1Ex1();
        hw1Ex2();
        hw1Ex3();
        hw1Ex4();
        hw1Ex5();
        hw1Ex6();
        hw1Ex7();
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
}
