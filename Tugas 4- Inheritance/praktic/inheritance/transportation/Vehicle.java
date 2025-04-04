package praktic.inheritance.transportation;
// Parent class transportation
public class Vehicle {
      // Atribut dasar untuk semua kendaraan
      protected String name;
      protected int capacity;
      protected int currentPassengers;
      protected String route;
  
      // Konstruktor untuk inisialisasi kendaraan
      public Vehicle(String name, int capacity, String route, int currentPassengers) {
          this.name = name;
          this.capacity = capacity;
          this.route = route;
          this.currentPassengers = currentPassengers;
      }
  
      // Metode untuk memulai perjalanan
      public void startTrip() {
          System.out.println(name + " memulai perjalanan pada rute " + route);
      }
  
      // Metode untuk menghentikan perjalanan
      public void stopTrip() {
          System.out.println(name + " telah mencapai tujuan akhir dan berhenti.");
      }
  
      // Menambah penumpang ke kendaraan
      public void addPassenger(int count) {
          if (currentPassengers + count <= capacity) {
              currentPassengers += count;
              System.out.println(count + " orang penumpang naik. Jumlah penumpang saat ini: " + currentPassengers);
          } else {
              System.out.println("Tidak bisa menambahkan penumpang, kapasitas penuh!");
          }
      }
  
      // Menurunkan penumpang dari kendaraan
      public void removePassenger(int count) {
          if (currentPassengers - count >= 0) {
              currentPassengers -= count;
              System.out.println(count + " orang penumpang turun. Jumlah penumpang saat ini: " + currentPassengers);
          } else {
              System.out.println("Jumlah penumpang tidak bisa negatif!");
          }
      }
  }
