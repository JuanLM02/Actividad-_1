/*
A la mamá de Juan le preguntan su edad, y contesta: tengo 3 hijos, pregúntele a Juan su
edad. Alberto tiene 2/3 de la edad de Juan, Ana tiene 4/3 de la edad de Juan y mi edad es
la suma de las tres. Hacer un algoritmo que muestre la edad de los cuatro.
 */
package juanlopez.activity_1;

import java.util.Scanner;

public class Activity_1 {

    public static void main(String[] args) {
        int juan;
        float albert, ana, mom;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un valor entero:");
        juan = entrada.nextInt();

        albert = (2 * juan / 3);
        ana = (4 * juan / 3);
        mom = (albert + ana + juan);

        System.out.println("Las edades son: ");
        System.out.println("Alberto: " + Math.round(albert) + " Juan: " + juan);
        System.out.println("Ana: " + Math.round(ana) + " Mamá: " + Math.round(mom));
        
    }
}
