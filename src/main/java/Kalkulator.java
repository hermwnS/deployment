/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Kalkulator {
    public static double hitung(double bilangan1, double bilangan2, char operator){
        switch(operator){
            case '+':
                return bilangan1 + bilangan2;
            case '-':
                return bilangan1 - bilangan2;
            case '*':
                return bilangan1 * bilangan2;
            case '/':
                if(bilangan2 == 0){
                    throw new IllegalArgumentException("Pembagi tidak boleh 0");
                }
                return bilangan1 / bilangan2;
            default:
                throw new IllegalArgumentException("Operator tidak valid");
        }
    }
}
