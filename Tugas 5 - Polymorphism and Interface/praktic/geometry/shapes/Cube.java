package praktic.geometry.shapes;

import praktic.geometry.bases.Shape;
import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.Weightable;

// Kelas Cube yg mewarisi kelas Shape dan mengimplementasikan ThreeDimensional dan Weightable
public class Cube extends Shape implements ThreeDimensional, Weightable {
    
    // Field untuk panjang rusuk dan massa kubus
    private double edge;
    private double mass;

    // Konstruktor default, hanya menetapkan nama bentuk
    public Cube() {
        setName("3D Weightable Cube");
    }

    // Konstruktor dengan parameter untuk mengatur panjang rusuk dan massa
    public Cube(double edge, double mass) {
        setName("Cube");
        this.edge = edge;
        this.mass = mass;
    }

    // Override method untuk menghitung luas permukaan kubus (6 * sisi²)
    @Override
    public double getSurfaceArea() {
        return 6 * edge * edge;
    }

    // Override method untuk menghitung volume kubus (sisi³)
    @Override
    public double getVolume() {
        return edge * edge * edge;
    }

    // Override method dari Weightable untuk menghitung berat (massa * gravitasi)
    @Override
    public double getWeight() {
        return mass * g;
    }

    // Override method dari Shape untuk mencetak informasi bentuk
    @Override
    public void printInfo() {
        System.out.println("Name            : " + getName());
        System.out.println("Surface area    : " + getSurfaceArea());
        System.out.println("Volume          : " + getVolume());
        System.out.println("Weight          : " + getWeight());
    }
}
