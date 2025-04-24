package praktic.geometry.shapes;

import praktic.geometry.bases.CircularShape;
import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.Weightable;


// Kelas Sphere merupakan turunan CircularShape dan mengimplementasikan ThreeDimensional serta Weightable
public class Sphere extends CircularShape implements ThreeDimensional, Weightable {

    // Field untuk menyimpan massa bola
    private double mass;

    // Konstruktor default
    public Sphere() {
        setName("3D Sphere");
    }

    // Konstruktor dengan parameter radius dan massa
    public Sphere(double radius, double mass) {
        setName("Sphere");       // Atur nama bentuk
        setRadius(radius);       // Atur jari-jari bentuk
        this.mass = mass;        // Atur massa bola
    }

    // Override method untuk menghitung luas permukaan bola: 4πr²
    @Override
    public double getSurfaceArea() {
        return 4 * (PI_NUMERATOR / (double) PI_DENOMINATOR) * getRadius() * getRadius();
    }

    // Override method untuk menghitung volume bola: (4/3)πr³
    @Override
    public double getVolume() {
        return (4.0 / 3) * (PI_NUMERATOR / (double) PI_DENOMINATOR) * getRadius() * getRadius() * getRadius();
    }

    // Override method untuk menghitung berat bola: massa × gravitasi
    @Override
    public double getWeight() {
        return mass * g;
    }

    // Override method untuk mencetak informasi lengkap bola
    @Override
    public void printInfo() {
        System.out.println("Name            : " + getName());
        System.out.println("Surface area    : " + getSurfaceArea());
        System.out.println("Volume          : " + getVolume());
        System.out.println("Weight          : " + getWeight());   
    }
}
