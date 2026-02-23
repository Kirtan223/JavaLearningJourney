/* La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura, se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:

Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.

Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).

Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%

Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.

Por ejemplo, el resultado podría ser algo así:

La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882

*/
import java.util.Scanner;


public class Tarea01 {
    public static void main(String[] args) {
        String descripFactura;
        double  presio1, presio2, totalAimpuesto, totalDimpuesto;

        Scanner descripcion = new Scanner(System.in);
        System.out.println("escriba la descripcion de la factura");
        descripFactura = descripcion.nextLine();


        Scanner p1 = new Scanner(System.in);
        System.out.println("ingrese el presio del primer producto");
        presio1 = p1.nextDouble();

        Scanner p2 = new Scanner(System.in);
        System.out.println("ingrese el presio del segundo producto");
        presio2 = p2.nextDouble();

        totalAimpuesto = presio1+presio2;
        totalDimpuesto = totalAimpuesto * 1.19;

        System.out.println( "la factura del productos (s)" + descripFactura + " es de " + totalAimpuesto + " antes de impuestos "
                + "y de " + totalDimpuesto + " despues de inpuestos");

    }
}
