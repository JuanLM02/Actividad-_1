/*
 Hacer un seguimiento (prueba de escritorio) del siguiente grupo de instrucciones.
INICIO
 SUMA = 0
 X = 20
 SUMA = SUMA + X
 Y = 40
 X = X + Y ** 2
 SUMA = SUMA + X / Y
 ESCRIBA: “EL VALOR DE LA SUMA ES:”, SUMA
FIN_INICIO
 */
package juanlopez.activity_1;

public class Punto_5 {

    public static void main(String[] args) {
        float suma,x, y, p;
        
        suma = 0;
        x = 20;
        y = 40;
        suma = (suma + x);
        p = (float) (Math.pow(y, 2)); //variable que guarda la operacionde potencia
        x = (x + p);
        suma = suma + (x / y);
        
        System.out.println("EL VALOR DE LA SUMA ES: " + suma);
    }

}
