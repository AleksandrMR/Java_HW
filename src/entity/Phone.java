package entity;

public class Phone {
    String model;
    String phoneNumber;
    public Calculator myCalculator;

    public Phone(String model, String phoneNumber) {
        System.out.println("phone created");
        this.model = model;
        this.phoneNumber = phoneNumber;
        this.myCalculator =  createCalculator();
    }

    public void call(String callerPhoneNumber) {
        System.out.printf("calling from phone: %s, to phone: %s", this.phoneNumber, callerPhoneNumber);
    }

    public Calculator createCalculator() {
        myCalculator = new Calculator();
        return myCalculator;
    }
}
