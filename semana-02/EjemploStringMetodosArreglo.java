/* Krisna Kirtan Castro Vivar
    24 de febrero 2026
    en este ejecicio se aprendio que los string hacen objetos inmutables donde y que la variable marcada por el nombre dels string es la referencia a ese objeto
    que cunado se crea un nuebo
 */

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

        int j;
        for(j=0; j<l ; j++ );





    }
}

