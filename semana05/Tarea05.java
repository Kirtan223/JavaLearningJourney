/* Krisna Kirtan Castro Vivar
20 marzo 2026
El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.

Podría ser utilizando operador ternario.
 */
package semana05;

import javax.swing.*;

public class Tarea05 {
    public static void main(String[] args) {
        double nu1,nu2;

String n1 = JOptionPane.showInputDialog("inserte el un numero");
nu1 = Double.parseDouble(n1);

String n2 = JOptionPane.showInputDialog("inserte el un numero");
nu2 = Double.parseDouble(n2);

String mensaje = nu1 > nu2?
        "el mayor es " + nu1 + " y el menor es " + nu2 :
        "el mayor es " + nu2 + " y el menor es " + nu1;
JOptionPane.showMessageDialog(null, mensaje);






    }
}
