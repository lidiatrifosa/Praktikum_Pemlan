package praktic.geometry.shapes;

import praktic.geometry.bases.Shape;
import praktic.geometry.interfaces.TwoDimensional;

// Kelas Square mewakili bentuk persegi,turunan dari Shape dan mengimplementasikan TwoDimensional
public class Square extends Shape implements TwoDimensional {

    // Field untuk panjang sisi persegi
    private double side;

    // Konstruktor default, hanya menetapkan nama bentuk
    public Square() {
        setName("2D Square");
    }

    // Konstruktor dengan parameter sisi, sekaligus mengatur nama
    public Square(double side) {
        setName("Square");   // Atur nama bentuk
        this.side = side;    // Simpan nilai sisi
    }

    // Override method untuk menghitung luas persegi (sisi × sisi)
    @Override
    public double getArea() {
        return side * side;
    }

    // Override method untuk menghitung keliling persegi (4 × sisi)
    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    // Override method untuk mencetak informasi lengkap tentang persegi
    @Override
    public void printInfo() {
        System.out.println("Name            : " + getName());
        System.out.println("Area            : " + getArea());
        System.out.println("Perimeter       : " + getPerimeter());
    }
}