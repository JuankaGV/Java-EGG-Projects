/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10;
import java.util.Scanner;
/**
 *
 * @author juang
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numero;
        System.out.println("Ingrese un numero");
        Scanner leer = new Scanner(System.in);
        numero = leer.next();
        System.out.println("El limite sera de: "+ numero);
        String limite;
        limite = numero;
        String num1;
        System.out.println("Ingrese numeros hasta superar el limite");
        num1 = leer.next();
        String num2;
        String suma;
        do {
           num2=leer.next();
           suma = num1 + num2; 
           
  
    

