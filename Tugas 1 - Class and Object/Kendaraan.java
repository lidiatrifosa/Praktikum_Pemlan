public class Kendaraan {
    // Fields
    String merk;
    String model;
    int tahun;
    int kecepatan;

    // Constructor
    public Kendaraan(String merk, String model, int tahun) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.kecepatan = 0; 
    }

    // Method 1 : untuk menampilkan atribut objek
    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun: " + tahun);
        System.out.println("Kecepatan awal : " + kecepatan + " km/jam");
    }

    // Method 2 : untuk menambah kecepatan
    public void tambahKecepatan(int tambahan) {
        kecepatan += tambahan;
        System.out.println(" > Kecepatan saat ini bertambah menjadi : " + kecepatan + " km/jam");
    }
}
