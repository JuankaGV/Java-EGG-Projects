/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package ejercicio7;
import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {
    String frase;
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese una frase");
    frase = leer.next();
    if (frase.equals("eureka")){
        System.out.println("La frase es correcta");
    }
    else {
        System.out.println("La frase es incorrecta");
    }
    
    }
    
}

