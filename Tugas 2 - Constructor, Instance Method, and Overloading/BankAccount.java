/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Lidia Trifosa Simangunsong
 */
public class BankAccount {
    // Field
    String noRek;
    String namaPemilik;
    double saldo;
    
     // Konstruktor 1
    public BankAccount (String noRek, String namaPemilik, double saldo) {
           this.noRek = noRek;
           this.namaPemilik= namaPemilik;
           this.saldo= saldo;
        }
     // Konstruktor 2
      public BankAccount (String noRek, String namaPemilik) {
           this.noRek = noRek;
           this.namaPemilik= namaPemilik;
           this.saldo= 0;       
          }
    
     // Method 1 : untuk menampilkan informasi 
    public void displayInfo() {
        System.out.println("Nomor Rekening : " + noRek);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: " + saldo);
    }
    
     // Method 2 : deposit
    public BankAccount deposit(double  nominal) {
        Scanner input = new Scanner(System.in);
        System.out.println("Berapa jumlah yang akan Anda deposit?");
        nominal = input.nextDouble();
       if (nominal <= 0)  {
        System.out.println("Nominal deposit harus lebih dari 0!");
        } else {
        saldo += nominal;
           System.out.println(" Jumlah yang anda depositkan : " + nominal );
        }   
       return this;
    }
       
         // Method 3 : withdraw
    public BankAccount withdraw(double nominal) {
        Scanner input = new Scanner(System.in);
        System.out.println("Berapa jumlah yang akan Anda tarik?");
        nominal = input.nextDouble();
       if (nominal <= 0)  {
        System.out.println("Nominal penarikan harus lebih dari 0!");
        } else if (nominal> saldo) {
         System.out.println("Saldo tidak mencukupi");
        } else { 
             saldo -= nominal;
             System.out.println(" Jumlah yang anda tarik : " + nominal );
        }
       return this;
    }
   
}
