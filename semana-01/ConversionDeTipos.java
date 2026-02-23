/* en este ejercicio se reviso como se pueden ultizar las conversiones de datos String a primitivos y viceversa*/





public class ConversionDeTipos {
    public static void main(String[] args) {
        //conversiones de Strinf a primitivo
        String numeroStr = "59";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);


        String realStr = "92934.98e-3";
        double numeroDecimal = Double.parseDouble(realStr);
        System.out.println("nuemroDecimal =" + numeroDecimal);

        String logicoStr = "true";
        boolean numeroBoleano = Boolean.parseBoolean(logicoStr);
        System.out.println("numeroBoleano = " + numeroBoleano);

        int otroNumeroInt = 100;

        System.out.println("el otro numero int es igual a= " + otroNumeroInt);

        String otroNumeroString = Integer.toString(otroNumeroInt);
        System.out.println( "el otro numero int es igual a= " + otroNumeroString);

        //convercion de primitivo a String

        otroNumeroString = String.valueOf(otroNumeroInt);                          /* cuidado con value of ya que dependiendo lo que metas saca diferentes resultados
                                                                                      si metes una variable que es un numero hara la suma pero si metes una que es un string va a concatenar*/
        System.out.println("otro numero string es igual a =" + otroNumeroString);

        double otrorealDouble = 1.234566;
        String otroRealStr = Double.toString( otrorealDouble );
        System.out.println("otro real doubel es igual a =" + otroRealStr);

        otroRealStr = String.valueOf(1.234566e2f );
        System.out.println("otroRealStr es igual a = " + otroRealStr);

        //convercion de primitivo a primitivo

        int i = 1234;
        System.out.println("el dato completo en integer es = "+ i );


        short s = (short) i; //esto forza la conversion pero hay perdida de datos ya que shor soporta 16 bit nada mas
        System.out.println("el dato comvertido a short es " + s );
        long l = (long) i;
        System.out.println(i);
        char c = (char) i;
        System.out.println(i);
        float f = (float) i;
        System.out.println(i);

    }
}
