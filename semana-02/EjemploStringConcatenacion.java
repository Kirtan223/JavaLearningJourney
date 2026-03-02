/* Krisna Kirtan Castro Vivar
23 de febrero del 2026

 */

public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Curso de java";
        String profesor = "Krisna Kirtan";
        String detalle = curso + " Con el instructor " + profesor;
        System.out.println("detalle = "+ detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + (numeroA + numeroB)); // para que pueda hacer la suma se pone entre parentesis asi
                                                            // tiene preferencia lo que esta adentro del parentesis si no
                                                            //  lo tubiera haria concatenacion ya que lo primero que encuentra al
                                                            // evaluar es un string (detalle)  y supone que lo demas tambien lo es

        System.out.println(numeroA + numeroB + detalle); // en este caso hace la suma ptimero y depsues concatena el texto
                                                            // ya que no puede sumar el texto a el resultado numerico

        String detalle2 = curso.concat(" ")+profesor; // el .concat se puede usar para concatenar tambien como si fuera un +
        System.out.println(detalle + detalle2);           // siendo en teoria mas eficiente el .concat


    }
}
