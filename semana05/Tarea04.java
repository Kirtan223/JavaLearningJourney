/* Krisna kirtan Castro Vivar
ejecicio de nivel de gasolina
20 de marzo 2026

Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...

La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero tambien puede ser del tipo int.

Si la capacidad actual es 70 litros: imprimir Estanque lleno

Si está entre 60 y menor a 70: imprimir Estanque casi lleno

Si está entre 40 y menor a 60: imprimir Estanque 3/4

Si está entre 35 y menor a 40: imprimir Medio Estanque

Si está entre 20 y menor a 35: imprimir Suficiente

Si está entre 1 y menor a 20: imprimir Insuficiente

 */




package semana05;
import javax.swing.*;

public class Tarea04 {
    public static void main(String[] args) {
        String Estado = " ";

        double nivel = 0.0;
        String entrada = JOptionPane.showInputDialog("cuantos litros tiene el tanque");
        nivel = Double.parseDouble(entrada);

        if(nivel == 70){
            JOptionPane.showMessageDialog(null,"tanque lleno");
        } else if (nivel >= 60) {
            JOptionPane.showMessageDialog(null," Tanque casi lleno");
            
        }else if (nivel >= 40) {
            JOptionPane.showMessageDialog(null," Tanque 3/4");

        }else if (nivel >= 35) {
            JOptionPane.showMessageDialog(null," Tanque medio");

        }else if (nivel >= 20) {
            JOptionPane.showMessageDialog(null," Tanque suciciente");

        }else if (nivel >= 0) {
            JOptionPane.showMessageDialog(null," Tanque insuficiente");

        }


    }
}

