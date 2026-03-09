/* Krisna Kirtan Castro Vivar
05 de marzo del 2026

este ejercicio pretende demostrar calguna de las maneras en las que se pueden usar los operadores aritmeticos
 */

package semana03;

public class EjemploOperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5, j = 4;

        int suma = i + j;
        System.out.println("suma = " + suma);
        System.out.println("suma = " + (i + j));
        // \System.out.println("suma = " + i + j); de esta manera no se puede ya que el primer termino
                                                    // detecta los demas como  un string
        int resta = i-j;
        System.out.println("resta = " + resta);
        System.out.println("resta = " + (i-j));


        int multi = i*j;
        System.out.println("multi = " + multi);
        System.out.println("multi = " + (i *j));

        int div = i / j;
        System.out.println("div = " + div);
        System.out.println("div = " + (i / j));


        float mod = i % j;
        System.out.println("mod = " + mod);
        System.out.println("mod = " + (i % j ));





    }

}
