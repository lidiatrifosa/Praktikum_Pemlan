package utp.shapes;

public class PrismaSegitigaSamaKaki {
    private final String NAMA = "Prisma Segitiga Sama Kaki";
    private final double PI = 22.0 / 7.0;
    private double alas, kaki, tinggi;

    public PrismaSegitigaSamaKaki(double alas, double kaki, double tinggi) {
        this.alas = alas;
        this.kaki = kaki;
        this.tinggi = tinggi;
    }

    public double getLa() {
        return alas * tinggiSegitiga() / 2;
    }

    public double getK() {
        return 2 * kaki + alas;
    }

    private double tinggiSegitiga() {
        return Math.sqrt(Math.pow(kaki, 2) - Math.pow(alas / 2, 2));
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
