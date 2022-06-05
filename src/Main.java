public class Main {
    public static void main(String[] args) {
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
            System.out.println("hw1Ex1:\n" + "This number has" + count + "digits and is negative");
        } else {
            System.out.println("hw1Ex1:\n" + "This number has " + count + " digits and is positive");
        }
    }

    public static void hw1Ex2() {
        int a = 0;
        int b = 0;
        int c = 0;

        if ((a + b) > c) {
            System.out.println("hw1Ex2:\n" + "Triangle exists");
        } else if ((a + c) > b) {
            System.out.println("hw1Ex2:\n" + "Triangle exists");
        } else if ((b + c) > a) {
            System.out.println("hw1Ex2:\n" + "Triangle exists");
        } else {
            System.out.println("hw1Ex2:\n" + "Triangle does not exist");
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
        System.out.println("hw1Ex3:\n" + someInt);
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
        System.out.println("hw1Ex4:\n" + countPositiveNumbers);
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
        System.out.println("hw1Ex5:\n" + "PositiveNumbersCount - " + countPositiveNumbers);
        System.out.println("NegativeNumbersCount - " + countNegativeNumbers);
    }

    public static void hw1Ex6() {
        int a = 1;
        int b = 2;

        if (a > b) {
            System.out.println("hw1Ex6:\n" + a);
        } else {
            System.out.println("hw1Ex6:\n" + b);
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
        System.out.println("hw1Ex7:\n" + strPrint + strEnd);
    }
}