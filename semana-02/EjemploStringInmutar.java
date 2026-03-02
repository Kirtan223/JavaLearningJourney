/* Krisna Kirtan Castro Vivar
23 de febrero del 2026
lo que se pretende ver en este ejercicio es que los string son inmutables aun cuando se hace concatenacion
o modificacion lo unico que pasa es que se crea una nuevo objeto con los cambios hace la antigua pero en
teoria el string original sigue igual
 */

public class EjemploStringInmutar {
    public static void main(String[] args) {
        String curso = "Curso de java";
        String profesor = "Krisna Kirtan";

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        String resultado2 = curso.transform( c -> {
            return c + " con " + profesor;

                }
                );
        System.out.println("curso = " + curso);
        System.out.println("resultado2" + resultado2 );


    }
}
