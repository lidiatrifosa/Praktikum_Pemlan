package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

// Kelas Sphere untuk merepresentasikan donat tanpa lubang (bola)

public class Sphere extends Shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    private double radius; 

    // Konstruktor
    public Sphere() {
        this.radius = 0;
    }

    public Sphere(double radius) {
        this.radius = radius;
    }

    // Method menghitung volume bola: (4/3) * π * radius³
    @Override
    public double getVolume() {
        return (4.0 / 3.0) * PI * radius * radius * radius;
    }

    // Method menghitung luas permukaan bola
    @Override
    public double getSurfaceArea() {
        return 4 * PI * radius * radius;
    }

    // Method menghitung massa: luas permukaan * ketebalan * massa jenis
    @Override
    public double getMass() {
        return getSurfaceArea() * THICKNESS * DENSITY;
    }

    // Menampilkan informasi bola
    @Override
    public void printInfo() {
        System.out.println("Volume : " + getVolume());
        System.out.println("Luas permukaan : " + getSurfaceArea());
        System.out.println("Massa : " + getMass());
        System.out.println("Massa dalam kg : " + gramToKilogram());
        System.out.println("Biaya kirim : Rp" + (int) calculateCost());
        System.out.println("=============================================");
    }

    // Konversi gram ke kilogram
    @Override
    public double gramToKilogram() {
        return Math.ceil(getMass() / DENOMINATOR * 100) / 100;
    }

    // Menghitung biaya kirim dengan pembulatan ke atas per kg
    @Override
    public double calculateCost() {
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG;
    }
}