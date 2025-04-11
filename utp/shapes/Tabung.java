package utp.shapes;

public class Tabung {
    private final String NAMA = "Tabung";
    private final double PI = 22.0 / 7.0;
    private double radius, tinggi;

    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    public double getLa() {
        return PI * radius * radius;
    }

    public double getK() {
        return 2 * PI * radius;
    }

    public double getLuasPermukaan() {
        return 2 * getLa() + getK() * tinggi;
    }

    public double getVolume() {
        return getLa() * tinggi;
    }

    public void printInfo() {
        System.out.println("=============================================");
        System.out.printf("\nNama\t\t: %s\nLuas permukaan\t: %.2f\nVolume\t\t: %.2f\n",
                NAMA, getLuasPermukaan(), getVolume());
    }
}