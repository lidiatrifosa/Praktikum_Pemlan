package praktic.geometry.shapes;

import praktic.geometry.bases.Shape;
import praktic.geometry.bases.CircularShape;
import praktic.geometry.interfaces.TwoDimensional;

// Kelas Circle merupakan turunan dari CircularShape dan mengimplementasikan TwoDimensional
public class Circle extends CircularShape implements TwoDimensional {

    // Konstruktor default tanpa parameter, menetapkan nama ke "2D Circle"
    public Circle() {
        setName("2D Circle"); 
    }

    // Konstruktor dengan parameter radius
    // Memanggil konstruktor induk CircularShape lalu mengatur nama dan radius
    public Circle(double radius) {
        super();                 // Memanggil konstruktor kosong CircularShape
        setName("Circle");      // Atur nama bentuk
        setRadius(radius);      // Atur nilai radius
    }

    // Override method dari interface TwoDimensional untuk menghitung luas
    @Override
    public double getArea() {
        // Menggunakan rumus πr² dengan π = 22/7
        return ((double) PI_NUMERATOR / PI_DENOMINATOR) * getRadius() * getRadius();
    }

    // Override method dari interface TwoDimensional untuk menghitung keliling
    @Override
    public double getPerimeter() {
        // Menggunakan rumus 2πr dengan π = 22/7
        return ((double) PI_NUMERATOR / PI_DENOMINATOR) * 2 * getRadius();
    }

    // Override method abstrak dari Shape untuk mencetak informasi bentuk
    @Override
    public void printInfo() {
        System.out.println("Name            : " + getName());
        System.out.println("Area            : " + getArea());
        System.out.println("Perimeter       : " + getPerimeter());
    }
}
