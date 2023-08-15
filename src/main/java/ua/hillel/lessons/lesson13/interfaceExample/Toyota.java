package ua.hillel.lessons.lesson13.interfaceExample;

public class Toyota implements Car, Parts {
    @Override
    public void passengerPlaces() {
        System.out.print("4 places_ ");
    }

    @Override
    public void pricePerKillometr() {
        System.out.print("price per kilometr - 10$_ ");
    }

    @Override
    public void getPassenger() {
        System.out.print("get passenger_ ");
    }

    @Override
    public void passengerPay() {
        System.out.print("passenger pay");
    }

    @Override
    public void changeParts() {
        System.out.println();
        System.out.print("Change part");
    }
}
