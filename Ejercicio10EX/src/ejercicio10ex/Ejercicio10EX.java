/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10ex;
import java.util.Scanner;
/**
 *
 * @author juang
 */
public class Ejercicio10EX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int valor1 = (int) (Math.random()*11);
        int valor2 = (int) (Math.random()*11);
        int resultado = valor1 * valor2;
        int intentos = 1;
        while (intentos < 5) {
            System.out.println("Arriesgue un numero");
            int num = leer.nextInt();
            if (num == resultado){
                System.out.println("Ha acertado!!!");
                break;
            }
            intentos++;
            
        }
        if(intentos == 5){
        System.out.println("No Has acetado");
        }
    }
    
}
