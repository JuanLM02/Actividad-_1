/*
 Un empleado trabaja 48 horas en la semana a razón de $5.000 hora. El porcentaje de
retención en la fuente es del 12,5% del salario bruto. Se desea saber cuál es el salario bruto,
la retención en la fuente y el salario neto del trabajador. 
 */
package juanlopez.activity_1;

public class Punto_12 {

    public static void main(String[] args) {

        float reten, sal_bru, fuent_reten, neto;
        int h = 48;
        int valor_h = 5000;
        reten = (float) (0.125);
        sal_bru = h * valor_h ;
        fuent_reten = sal_bru * reten ;
        neto = sal_bru - fuent_reten ;
        
        System.out.println("El salario bruto del trabajador es: $ " + sal_bru);
        System.out.println("La retención en la fuente del trabajador es: $ " + fuent_reten);
        System.out.println("EL SALARIO NETO DEL TRABAJADOR ES: $ " + neto);
    }

}
