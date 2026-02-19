import javax.swing.*;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner (System.in);
        System.out.println("ingrese un numero entero ");
        String numerStr = scanner.nextLine( );
        int numeroDecimal = 0;


       try{
           numeroDecimal = Integer.parseInt(numerStr);

       } catch ( NumberFormatException e){
           System.out.println("Error ingresar un numero entero");
           main (args);
           System.exit(0);

       }




        String mensaje = ( "numero decilmal = " + numeroDecimal + "Numero binario de "  + "\n" + numeroDecimal + "= " + Integer.toBinaryString(numeroDecimal)
       + "\n" + "numero octal de  = " + numeroDecimal +" es igual a" + Integer.toOctalString(numeroDecimal) + "numero exadecimal de  = "
                + "\n" + numeroDecimal +" es igual a" + Integer.toHexString(numeroDecimal));

        System.out.println(mensaje);

       //JOptionPane.showMessageDialog (null, mensaje);

    }
}
