package ua.hillel.lessons.lesson13.interfaceExample;

public class TaxiController {

    public void aboutTaxiCar(Car car) {
        System.out.print("in this car ");
        car.passengerPlaces();
        car.pricePerKillometr();
        car.getPassenger();
        car.passengerPay();
    }

    public void repairTaxi(Parts parts) {
        parts.changeParts();
    }

}
