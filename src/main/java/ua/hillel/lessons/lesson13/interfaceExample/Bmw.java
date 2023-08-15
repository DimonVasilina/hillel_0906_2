package ua.hillel.lessons.lesson13.interfaceExample;

public class Bmw implements Car{
    @Override
    public void passengerPlaces() {
        System.out.print("2 places_ " );
    }

    @Override
    public void pricePerKillometr() {
        System.out.print("price per kilometr - 40$_ ");
    }

    @Override
    public void getPassenger() {
        System.out.print("get passenger_ ");
    }

    @Override
    public void passengerPay() {
        System.out.print("passenger pay");
    }
}
