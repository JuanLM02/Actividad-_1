/*
 Elabore un algoritmo que lea un número y obtenga su cuadrado y su cubo
 */
package juanlopez.activity_1;

import java.util.Scanner;

public class Punto_14 {

    public static void main(String[] args) {
        float x;
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        x = numero.nextFloat();
        
        System.out.println("El cuadrado del nuemro " + x + " es: "  + Math.pow(x, 2));
        System.out.println("El cubo del nuemro " + x + " es: "  + Math.pow(x, 3));
    }
}
