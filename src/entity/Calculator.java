package entity;

public class Calculator {

    public int doAddition(int a, int b) {
        int value = a + b;
        System.out.println("Calc.doAddition: " + a + " + " + b + " = " + (a + b));
        return value;
    }

    public int doSubtraction(int a, int b) {
        int value = a - b;
        System.out.println("Calc.doSubtraction: " + a + " - " + b + " = " + (a - b));
        return value;
    }

    public int doMultiplication(int a, int b) {
        int value = a * b;
        System.out.println("Calc.doMultiplication: " + a + " * " + b + " = " + (a * b));
        return value;
    }

    public int doDivision(int a, int b) {
        int value = a / b;
        System.out.println("Calc.doDivision: " + a + " / " + b + " = " + (a / b));
        return value;
    }

    public int doNumberToPower(double number, double power) {
        double num = Math.pow(number, power);
        System.out.println("Power of number " + (int)number + " is "  + (int)num);
        return (int)num;
    }

    public Boolean isEvenNumber(int number) {
        Boolean value;
        if (number % 2 == 0) {
            value = true;
            System.out.println("Number " + number + " is Even Number");
        } else {
            value = false;
            System.out.println("Number " + number + " is not Even Number");
        }
        return value;
    }
}
