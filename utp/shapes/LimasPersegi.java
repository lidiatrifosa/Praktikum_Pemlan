package utp.shapes;

public class LimasPersegi {
    private final String NAMA = "Limas Persegi";
    private double sisi, tinggi;

    public LimasPersegi(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    public double getLa() {
        return sisi * sisi;
    }

    public double getLs() {
        return (sisi * tinggi) / 2;
    }

    public double getLuasPermukaan() {
        return 4 * getLs() + getLa();
    }

    public double getVolume() {
        return getLa() * tinggi / 3;
    }

    public void printInfo() {
        System.out.println("=============================================");
        System.out.printf("\nNama\t\t: %s\nLuas permukaan\t: %.2f\nVolume\t\t: %.2f\n",
                NAMA, getLuasPermukaan(), getVolume());
    }
}
