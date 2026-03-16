/* Krisna Kirtan Castro Vivar
12 de marzo 2023
en este ejercio se presentra como se utilizan algunso de los operadores logicos


 */

package semana04;

public class OperadoresLogicos {
    public static void main(String[] args) {

    int i = 5;
    int j = 5;
    int k = 4;
    int l = 10;
     boolean m = false;









        boolean b1 = i == j & j == k;  // AND
        System.out.println("b1 = " + b1);

            

        boolean b2 = i == j || k > i; //or
        System.out.println("b2 = " + b2);


        boolean b3 = i == j & (k > i ||  m == true ); // en este se ve la precedencia se va revolviendo primero entre parentesis y luego de izquierda a derecha
        System.out.println("b3 = " + b3);

        boolean b4 = i == j  || k > l && m == true; // en este caso se ve la precedencia de los operadores por que primero se resuelve el && y despues lo de la izqui

        System.out.println("b4 = " + b4);










    }
}
