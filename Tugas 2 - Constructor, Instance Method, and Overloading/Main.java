package test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */
import test.BankAccount;
public class Main {
      public static void main(String[] args) {
        // Membuat instansiasi objek dengan constructor
        BankAccount akun1 = new BankAccount("012344", "Gita", 100000);
        BankAccount akun2 = new BankAccount("0123432", "Orel", 1526526);

    
        // > Akun1
        akun1.displayInfo();
        akun1.deposit(1000);
        akun1.withdraw(20000);
        System.out.println(); 

          // > Akun2
        akun2.displayInfo();
        akun2.deposit(1000);
        akun2.withdraw(20000);
    }
}
