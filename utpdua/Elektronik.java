package utpdua;

public class Elektronik extends BarangLelang {
    private int garansi;

    public Elektronik(String namaBarang, double hargaAwal, int garansi) {
        super(namaBarang, hargaAwal);
        this.garansi = garansi;
    }

    public void infoElektronik() {
        System.out.println("Barang elektronik ini memiliki garansi: " + garansi + " tahun");
    }
}

