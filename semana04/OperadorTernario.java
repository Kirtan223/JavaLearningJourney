/* Krisna Kirtan catro Vivar
12 de marzo 2026
 */
package semana04;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        String variableTer = 7 == 7 ?   "si es verdadero" : "si es falso";


        double matematicas, historia, ciencias, promedio;

        Scanner s = new Scanner(System.in);

        System.out.println("ingrese la nota de matematicas");
        matematicas = s.nextDouble();

        System.out.println("ingrese la nota de ciencias");
        ciencias = s.nextDouble();

        System.out.println("ingrese la nota de historia");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;


        System.out.println("variableTer = " + variableTer);

        String estado = "";
        estado = promedio >=7? "su promedio es de " + promedio + " y esta aprobado": "su promedio es de " + promedio + " y esta reprovado";
        System.out.println("estado = " + estado);

    }
}
