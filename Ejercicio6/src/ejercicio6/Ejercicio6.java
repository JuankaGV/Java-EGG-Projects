/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;
import java.util.Scanner;
/**
 *
 * @author juang
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero entero: ");
        numero = teclado.nextInt();
        if (numero % 2 == 0)
            System.out.println("Es par");
        else 
            System.out.println("Es impar");
        
    }
    
}
