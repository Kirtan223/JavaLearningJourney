/* en este ejerciio corto se vera como se pueden usar algunos metodos de string para encontrar las extenciones de archvos
en una computadora
 */



public class EjemploStringExtencion {
    public static void main(String[] args) {
        String archivo = "algun_archivo.jpg";
        int i = archivo.lastIndexOf(".");


        System.out.println("i = " + i);;



        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.length() = " + archivo.substring(i+1));





    }
}
