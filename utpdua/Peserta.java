package utpdua;

public class Peserta {
    private String nama;
    private double saldo;

    public Peserta(String nama, double saldo) {
        this.nama = nama;
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void tawar(BarangLelang barang, double jumlah) {
        barang.terimaPenawaran(this, jumlah);
    }
}

