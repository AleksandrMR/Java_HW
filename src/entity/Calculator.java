package entity;

public class Calculator {

    public void doAddition(int a, int b) {
        System.out.println("Calc.doAddition: " + a + " + " + b + " = " + (a + b));
    }

    public void doSubtraction(int a, int b) {
        System.out.println("Calc.doSubtraction: " + a + " - " + b + " = " + (a - b));
    }

    public void doMultiplication(int a, int b) {
        System.out.println("Calc.doMultiplication: " + a + " * " + b + " = " + (a * b));
    }

    public void doDivision(int a, int b) {
        System.out.println("Calc.doDivision: " + a + " / " + b + " = " + (a / b));
    }

    public void doNumberToPower(double number, double power) {
        double num = Math.pow(number, power);
        System.out.println("Power of number " + (int)number + " is "  + (int)num);
    }

    public void isEvenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is Even Number");
        } else {
            System.out.println("Number " + number + " is not Even Number");
        }
    }
}
