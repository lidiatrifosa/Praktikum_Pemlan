package utp.mains;

// Lidia Simangunsong-245150701111020
                                                                    
// _|        _|_|_|  _|_|_|    _|_|_|    _|_|    
// _|          _|    _|    _|    _|    _|    _|  
// _|          _|    _|    _|    _|    _|_|_|_|  
// _|          _|    _|    _|    _|    _|    _|  
// _|_|_|_|  _|_|_|  _|_|_|    _|_|_|  _|    _|  
                                              

import java.util.Scanner;
import utp.shapes.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Bangun Ruang");
        System.out.println("LIDIA TRIFOSA SIMANGUNSONG");
        System.out.println("245150701111020");
        System.out.println("=============================================");

        System.out.println("Prisma Segitiga Sama Kaki");
        System.out.println("=============================================");
        System.out.print("Isikan alas : ");
        double alas = sc.nextDouble();
        System.out.print("Isikan kaki : ");
        double kaki = sc.nextDouble();
        System.out.print("Isikan tinggi : ");
        double tinggiPrisma = sc.nextDouble();
        PrismaSegitigaSamaKaki prisma = new PrismaSegitigaSamaKaki(alas, kaki, tinggiPrisma);
        prisma.printInfo();

        System.out.println("\n=============================================");
        System.out.println("Limas Persegi");
        System.out.println("=============================================");
        System.out.print("Isikan sisi : ");
        double sisi = sc.nextDouble();
        System.out.print("Isikan tinggi : ");
        double tinggiLimas = sc.nextDouble();
        LimasPersegi limas = new LimasPersegi(sisi, tinggiLimas);
        limas.printInfo();

      
        System.out.println("\n=============================================");
        System.out.println("Tabung");
        System.out.println("=============================================");
        System.out.print("Isikan radius : ");
        double radius = sc.nextDouble();
        System.out.print("Isikan tinggi : ");
        double tinggiTabung = sc.nextDouble();
        Tabung tabung = new Tabung(radius, tinggiTabung);
        tabung.printInfo();

        System.out.println("\n=============================================");
    }
}
