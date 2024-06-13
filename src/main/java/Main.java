/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pertama : ");
        double bilangan1 = keyboard.nextDouble();
        
        System.out.print("Masukkan Operator (+, -, *, /) : ");
        char operator = keyboard.next().charAt(0);
        
        System.out.print("Masukkan bilangan kedua : ");
        double bilangan2 = keyboard.nextDouble();
        
        try{
            double hasil = Kalkulator.hitung(bilangan1, bilangan2, operator);
            System.out.println("Hasil : " + hasil);
        }catch(IllegalArgumentException e){
            System.err.println("Error : " + e.getMessage());
        }
    }
}
