package praktic.inheritance.mains;

import praktic.inheritance.transportation.Bus;
import praktic.inheritance.transportation.Train;
import praktic.inheritance.transportation.Taxi;

public class Main {
    public static void main(String[] args) {
        // Membuat objek kendaraan dari berbagai jenis
        Bus bus = new Bus("Terminal A - Terminal B");
        Train train = new Train("Stasiun Kota - Stasiun Pusat");
        Taxi taxi = new Taxi("Bandara - Hotel");

        // Simulasi perjalanan Bus
        bus.startTrip();
        bus.addPassenger(30);
        System.out.println("Tarif perjalanan bus: Rp" + bus.calculateBusFare(5));
        bus.removePassenger(10);
        bus.stopTrip();
        System.out.println("---------------------------------------------------------");

        System.out.println();

        // Simulasi perjalanan Kereta
        train.startTrip();
        train.addPassenger(150);
        System.out.println("Tarif perjalanan kereta: Rp" + train.calculateTrainFare());
        train.removePassenger(50);
        train.stopTrip();

        System.out.println("---------------------------------------------------------");

        // Simulasi perjalanan Taksi
        taxi.startTrip();
        taxi.addPassenger(3);
        System.out.println("Tarif perjalanan taksi: Rp" + taxi.calculateTaxiFare(10));
        taxi.removePassenger(3);
        taxi.stopTrip();
    }
}