/* Krisna Kirtan castro Vivar
05 de marzo 2026
en estos ejemplos se pretende demostrar como es que funcionan algunos de los operadores incrementales
 */

package semana03;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        // pre incremento se hace el incrmento y despues se asigna a la variable

        int i = 1;
        int j = ++i;  // i = i + 1;
        System.out.println("j = " + j);

        // post incremento  primero se asigna a la variable y despues se hace el incremnteo
        i = 2;
        System.out.println("valor de i antes del post incremento = " + i);
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);


        // pre decremto
        i = 3;
        j = --i;
        System.out.println("j = " + j);


        // post deecrmento

        i = 4 ;
        System.out.println("valor de i antes del post decremento = " + i);
        j = i --;
        System.out.println("valor de i despues del post decremnto = " + i);
        System.out.println("j = " + j);


    }

}
