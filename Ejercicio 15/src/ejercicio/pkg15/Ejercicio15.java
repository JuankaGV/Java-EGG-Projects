/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg15;

/**
 *
 * @author juang
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int [] arreglo = new int [101]; 
       int subindice = 0;
       while (subindice < 101){
           arreglo[subindice] = subindice + 1;
           subindice++;
       }
       System.out.println("Contenido del arreglo");
       for (int i = 0; i < 101; i++)
           System.out.println(arreglo[i]);
       
        
    }
    
}
