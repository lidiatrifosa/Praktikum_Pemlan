package praktic.inheritance.transportation;

// Subclass Bus
public class Bus extends Vehicle {
    private static final int FARE_PER_STOP = 2000; // Tarif per halte

    public Bus(String route) {
        super("Bus", 50, route, 0); // Tambahkan currentPassengers = 0
    }

    // Menghitung tarif bus berdasarkan jumlah halte yang dilewati
    public double calculateBusFare(int stops) {
        return stops * FARE_PER_STOP * currentPassengers;
    }
}