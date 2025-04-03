public class Main {
    public static void main(String[] args) {
        // Membuat instansiasi objek dengan constructor
        Kendaraan mobil1 = new Kendaraan("Toyota", "Avanza", 2003);
        Kendaraan mobil2 = new Kendaraan("Honda", "Civic", 1972);

        // Menampilkan informasi awal dengan jarak antar objek
        // > Mobil Avanza
        mobil1.tampilkanInfo();
        mobil1.tambahKecepatan(10);
        mobil1.tambahKecepatan(20);
        System.out.println(); 

          // > Mobil Civic
        mobil2.tampilkanInfo();
        mobil2.tambahKecepatan(20);
        mobil1.tambahKecepatan(30);
    }
}
