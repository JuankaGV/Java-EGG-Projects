/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg11ex;
import java.util.Scanner;
/**
 *
 * @author juang
 */
public class Ejercicio11EX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un nro entero: ");
        int num = leer.nextInt();
        int cont = 0;
        do{
            num = num/10;
            cont++;
        } while (num>0);
        System.out.println("El nro ingresado tiene "+cont+" digitos");
        }
    }
    
