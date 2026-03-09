package semana02;/*Krisna Kirtan Castro Vivar
23 de febrero 2026
Aui se vera la validacion de datos string de diferentes formas usando diferentes metodos
 */

import java.sql.SQLOutput;

public class EjemploStringValidar {
    public static void main(String[] args) {
            String curso = "h";
            boolean esNulo = curso == null;                       // estoy declarandlo la variable esNulo con el valor de true o false dependiendo de la comparacion de la variable curso con un valor de null
            System.out.println("el curso es Nulo = " + esNulo);

            if(esNulo) {                               //revisa si la variable string e nula
                    curso = "";
                               }
            Boolean esVacio = curso.length() == 0;                  //revisa si la variable string esta vacia por medio de curso .leng
            System.out.println("el curso esta vacio = " + esVacio);         // que revisa la cantidad de caractes

            boolean esVasio2 = curso.isEmpty();
            System.out.println("el curso esta vacio revision 2 = " + esVasio2);  // revisa si la variable string esta vacia por medi de /isEmpty

            if(curso != null && curso.length() > 0){                        // ejemplo de validacion de datos con varias restriciones en el if
                System.out.println(curso.toUpperCase());
                System.out.println("bienvenidos dal curso de " + curso );

            }

        if(curso != null && !curso.isEmpty()){                        // ejemplo de validacion de datos con .isEmpty solo que en este caso se le puso ! para que revisara si tiene algo
            System.out.println(curso.toUpperCase());
            System.out.println("bienvenidos dal curso de " + curso );

        }

            if(curso.length() > 0) {
                System.out.println(curso.toUpperCase());
                System.out.println("bienvenidos dal curso de " + curso );


            }

            boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        if(esBlanco == false){
            System.out.println(curso.toUpperCase());
            System.out.println("bieenvenido al curso de " + curso);
        }



    }

}
