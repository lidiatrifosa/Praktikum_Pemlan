//ooooo       ooooo ooooooooo  ooooo      o      
// 888         888   888    88o 888      888     
// 888         888   888    888 888     8  88    
// 888      o  888   888    888 888    8oooo88   
//o888ooooo88 o888o o888ooo88  o888o o88o  o888o 

// LIDIA TRIFOSA SIMANGUNSONG - 245150701111020

package praktic.geometry.mains;

import java.util.Scanner;
import praktic.geometry.bases.*;
import praktic.geometry.shapes.*;
import praktic.geometry.interfaces.*;

// Kelas utama untuk menjalankan program dan berinteraksi dgn user
public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kode untuk pewarnaan output terminal
        String BLUE = "\u001B[34m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String CYAN = "\u001B[36m";

        // Informasi pembuka
        System.out.println(RED + "======================================");
        System.out.println("Shape Calculator");
        System.out.println("LIDIA TRIFOSA SIMANGUNSONG");
        System.out.println("245150701111020");
        System.out.println(RED + "======================================");

        // 2D Circle
        System.out.println(BLUE + "2D Circle");
        System.out.println(RED + "======================================");
        System.out.print(GREEN + "Enter radius    : ");
        CircularShape circle = new Circle(input.nextDouble()); // buat objek Circle
        System.out.println(RED + "======================================");
        circle.printInfo(); // tampilkan informasi Circle
        System.out.println(RED + "======================================");

        // 2D Square
        System.out.println(BLUE + "2D Square");
        System.out.println(RED + "======================================");
        System.out.print(GREEN + "Enter side      : ");
        Shape square = new Square(input.nextDouble()); // buat objek Square
        System.out.println(RED + "======================================");
        square.printInfo(); // tampilkan informasi Square
        System.out.println(RED + "======================================");

        // 3D Weightable Cube 
        System.out.println(BLUE + "3D Weightable Cube");
        System.out.println(RED + "======================================");
        System.out.print(GREEN + "Enter edge      : ");
        double edge = input.nextDouble();
        System.out.print(GREEN + "Enter mass      : ");
        double mass = input.nextDouble();
        System.out.println(RED + "======================================");
        Shape cube = new Cube(edge, mass); // buat objek Cube
        cube.printInfo(); // tampilkan informasi Cube
        System.out.println(RED + "======================================");

        // 3D Weightable Sphere
        System.out.println(BLUE + "3D Weightable Sphere");
        System.out.println(RED + "======================================");
        System.out.print(GREEN + "Enter radius    : ");
        double radius = input.nextDouble();
        System.out.print(GREEN + "Enter mass      : ");
        double massa = input.nextDouble();
        System.out.println(RED + "======================================");
        Shape sphere = new Sphere(radius, massa); // buat objek Sphere
        sphere.printInfo(); // tampilkan informasi Sphere
        System.out.println(RED + "======================================");

        // Polymorphism melalui Interface
        System.out.println(BLUE + "Volume of Cube and Sphere");
        System.out.println(CYAN + "POLYMORPHISM: INTERFACE");
        System.out.println(RED + "======================================");
        System.out.print(GREEN + "Enter edge      : ");
        double edges = input.nextDouble();
        System.out.print(GREEN + "Enter radius    : ");
        double radiuss = input.nextDouble();
        System.out.print(GREEN + "Enter mass      : ");
        double masses = input.nextDouble();
        System.out.println(RED + "======================================");

        // Objek diakses melalui tipe interface
        ThreeDimensional cube3D = new Cube(edges, masses);
        ThreeDimensional sphere3D = new Sphere(radiuss, masses);
        Weightable weightable = new Sphere(radiuss, masses);

        // Tampilkan hasil perhitungan polymorphism
        System.out.println(RED + "======================================");
        System.out.println(CYAN + "Cube's volume   : " + cube3D.getVolume());
        System.out.println(CYAN + "Sphere's volume : " + sphere3D.getVolume());
        System.out.println(CYAN + "Weight          : " + weightable.getWeight());
        System.out.println(RED + "======================================");
    }
}
