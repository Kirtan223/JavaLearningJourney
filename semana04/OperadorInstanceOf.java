/* Krisna Kirtan Castro VIvar
13 de marzo 2026

 */


package semana04;

public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = " creando un objeto de la clase String ... que tal";

        Integer nume =  7;

        boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String  = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es de la clase objeto = " + b1);

        b1 = nume instanceof Object;
        System.out.println("numero es de laa clase objeto = " + b1);

        b1 = nume instanceof  Integer;
        System.out.println("numero es de la clase Integer? = " + b1);

        b1 = nume instanceof  Number;
        System.out.println("numero es de la clase Numero? = " + b1);
    }
}
