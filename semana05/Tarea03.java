package semana05;

import javax.swing.*;

public class Tarea03 {
    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog("inserta un nombre");
        String nombre2 = JOptionPane.showInputDialog("inserta un nombre");
        String nombre3 = JOptionPane.showInputDialog("inserta un nombre");
        String n1 = nombre1.split(" ")[0];// el string se convierte en un arreglo pero en lugar de tranforma todo en arreglo y depues buscar la parte que ncesitamos se usa d estra manara para solo tomar el primero elemento del arrego y hacerlo string
        String n2 = nombre2.split(" ")[0];
        String n3 = nombre3.split(" ")[0];

        String resultado = " ";
        if (n1.length()>n2.length() && n1.length()>n3.length()) {
            resultado = n1;

        }else {
            if(n2.length()> n1.length() && n2.length() > n3.length()){
                resultado = n2;

            }else {
                resultado = n3;
            }
            JOptionPane.showMessageDialog(null, resultado + "tiene el nombre mas largo ");
            //System.out.println("el nombre mas largo es " + resultado);
        }
        }


    }

