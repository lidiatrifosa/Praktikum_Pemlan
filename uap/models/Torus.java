package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

// Kelas Torus untuk merepresentasikan donat dengan lubang (torus)  Mengimplementasikan berbagai interface yang diperlukan
public class Torus extends Shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    private double majorRadius; // Radius utama torus
    private double minorRadius; // Radius minor torus

    // Konstruktor 
    public Torus() {
        this.majorRadius = 0;
        this.minorRadius = 0;
    }

    // Konstruktor
    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
        setName("Donat dengan lubang"); 
    }

    // Menghitung volume torus: 2 * π² * majorRadius * minorRadius²
    @Override
    public double getVolume() {
        return 2 * PI * PI * majorRadius * minorRadius * minorRadius;
    }

    // Menghitung luas permukaan torus: 4 * π² * majorRadius * minorRadius
    @Override
    public double getSurfaceArea() {
        return 4 * PI * PI * majorRadius * minorRadius;
    }

    // Menghitung massa: luas permukaan * ketebalan * massa jenis
    @Override
    public double getMass() {
        return getSurfaceArea() * THICKNESS * DENSITY;
    }

    // Menampilkan informasi torus
    @Override
    public void printInfo() {
        System.out.println("Volume : " + getVolume());
        System.out.println("Luas permukaan : " + getSurfaceArea());
        System.out.println("Massa : " + getMass());
        System.out.println("Massa dalam kg : " + gramToKilogram());
        System.out.println("Biaya kirim : Rp" + (int) calculateCost());
        System.out.println("=============================================");
    }

    // Konversi gram ke kilogram dengan pembulatan 2 digit desimal
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