/* Krisna Kirtan Casrro Vivar
13 de marzo 2026


 */


package semana04;

import java.util.Scanner;

public class OperdorTernarioNumeroMayor {
    public static void main(String[] args) {

        int max = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("ingrese un numero");
        int n1 = s.nextInt();

        System.out.println("ingrese un numero");
        int n2 = s.nextInt();

        System.out.println("ingrese un numero");
        int n3 = s.nextInt();


        max = (n1 > n2)? n1:n2;
        max = (max > n3)? max : n3;

        System.out.println("el numero 1 es " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("el numero mayor es max = " + max);


    }
}
