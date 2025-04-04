package praktic.inheritance.transportation;

// Subclass Taxi
public class Taxi extends Vehicle {
    private static final int FARE_PER_KM = 5000; // Tarif per kilometer

    public Taxi(String route) {
        super("Taksi", 4, route, 0); // Tambahkan currentPassengers = 0
    }

    // Menghitung tarif taksi berdasarkan jarak tempuh
    public double calculateTaxiFare(int km) {
        return km * FARE_PER_KM;
    }
}