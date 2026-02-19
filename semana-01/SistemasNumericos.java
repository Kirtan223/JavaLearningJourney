import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numerStr = JOptionPane.showInputDialog(null, "ingrese un numero entero " );
        int numeroDecimal = 0;

       try{
           numeroDecimal = Integer.parseInt(numerStr);

       } catch ( NumberFormatException e){  JOptionPane.showMessageDialog (null, "Error ingresar un numero entero"   );
           main (args);
           System.exit(0);

       }




        String mensaje = ( "numero decilmal = " + numeroDecimal + "Numero binario de "  + "\n" + numeroDecimal + "= " + Integer.toBinaryString(numeroDecimal)
       + "\n" + "numero octal de  = " + numeroDecimal +" es igual a" + Integer.toOctalString(numeroDecimal) + "numero exadecimal de  = "
                + "\n" + numeroDecimal +" es igual a" + Integer.toHexString(numeroDecimal));

       JOptionPane.showMessageDialog (null, mensaje);

    }
}
