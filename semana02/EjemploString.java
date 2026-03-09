package semana02;/* Krisna Kirtan Castro Vivar
23 de febrero del 2026

 */

public class EjemploString {
    public static void main(String[] args) {
        String curso = "Curso de java";
        String curso2 = new String( "Curso de Java");

        boolean esIgual = curso == curso2;
        System.out.println("es igual = " + esIgual); //compara los 2 objetos no el texto

        esIgual = curso.equals(curso2);
        System.out.println( "es igual = " + esIgual ); //compara el contenido del texto siendo sencibke a mayus y simbolos

        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println( "es igual = " + esIgual ); //compara el contenido del texto no sencible a mayus

        String curso3 = "Curso de java";
        esIgual = curso == curso3;
        System.out.println("es igual = " + esIgual);

    }
}
