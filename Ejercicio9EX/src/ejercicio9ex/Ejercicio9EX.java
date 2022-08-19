/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9ex;
import java.util.Scanner;
/**
 *
 * @author juang
 */
public class Ejercicio9EX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese dos valores enteros para dividir");
    int valor1 = leer.nextInt();
    int valor2 = leer.nextInt();
    int resultado =0;
    int cont = 0;
    while (valor1 >= resultado && valor1!=0){
        resultado = valor1 = valor2;
        valor1 = resultado;
        cont++;
    }
    System.out.println("El resultado de la division es " + cont + " y el resto es " + valor1);
    
    }
    
}
