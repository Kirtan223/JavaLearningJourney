package semana02;/* Krisna Kirtan Castro Vivar
    27 de febrero 2026
    en este ejerciio se vera como se puede segmentar un string en doferentes arreglos y con diferentes criterios de separacion


 */

import java.sql.SQLOutput;

public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray = " + trabalenguas.toCharArray());



        char [] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for(int i = 0; i < largo ; i ++){
            System.out.println("arreglo =" + arreglo [i] );
        }
        System.out.println();
        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for(int j =0; j<l; j++){
            System.out.println(arreglo2[j]);
        }

        String archivo = "algun.archivo.jpg";
        String[] archivoArreglo = archivo.split("\\."); // es importante al punto ponerle \\ por que el . es una palabra recerbada
        l = archivoArreglo.length;
        for(int j =0; j<l; j++){
            System.out.println(archivoArreglo[j]);


        }
        System.out.println("extension = " + archivoArreglo[l-1]);







    }
}

