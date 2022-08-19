/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
//dos. El programa deberá después mostrar el resultado de la suma
package egg;
import java.util.Scanner;  

/**
 *
 * @author juang
 */
public class EGG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma;
        int num1;
        int num2;
        Scanner numeros = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        num1 = numeros.nextInt();
        num2 = numeros.nextInt();
        suma = num1 + num2;
        System.out.print("La suma de los dos numeros es igual a; "+ suma);
    }
    
}

