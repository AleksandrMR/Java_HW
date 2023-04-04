package entity;

public class Money {
    long euro;
    int cents;

    public long Money(long euro, int cents) {
        this.euro = euro;
        this.cents = cents;
        System.out.println(euro + "," + cents);
        return 0;
    }
}
