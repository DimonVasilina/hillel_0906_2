package ua.hillel.lessons.lesson13.interfaceExample;

public interface Car {

    String nameOfObject = "Car";

    void passengerPlaces();

    void pricePerKillometr();

    void getPassenger();

    void passengerPay();

    default void countWheels() {
        System.out.print("4");
    }
}
