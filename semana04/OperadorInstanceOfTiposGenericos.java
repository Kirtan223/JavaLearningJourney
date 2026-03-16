/* Krisna Kirtan Castro VIvar
13 de marzo 2026

 */


package semana04;

public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {
        Object texto = " creando un objeto de la clase String ... que tal"; // aqui se cambio de tipo string a tipo object para que lo podamos evaluar con instance of y corra el programa

        Object nume =  7; //  aqui se cambio de tipo Integer a tipo number asi nos permite evaluar

        boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String  = " + b1);

        b1 = texto  instanceof Integer;
        System.out.println("texto es del tipo integer = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es del tipo objeto = " + b1);

        b1 = nume instanceof Object;
        System.out.println("numero es del tipo objeto = " + b1);


        b1 = nume instanceof  Integer;
        System.out.println("numero es del tipo Integer? = " + b1);

        b1 = nume instanceof  Number;
        System.out.println("numero es del tipo  Number? = " + b1);

        b1 = nume instanceof Long;
        System.out.println("numero es del tipo Long = " + b1);
    }
}
