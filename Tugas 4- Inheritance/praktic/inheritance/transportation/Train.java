package praktic.inheritance.transportation;

// Subclass Train
public class Train extends Vehicle {
    private static final int FIXED_FARE = 10000; // Tarif tetap per penumpang

    public Train(String route) {
        super("Kereta", 200, route, 0); // Tambahkan currentPassengers = 0
    }

    // Menghitung tarif kereta (tarif tetap per penumpang)
    public double calculateTrainFare() {
        return FIXED_FARE * currentPassengers;
    }
}