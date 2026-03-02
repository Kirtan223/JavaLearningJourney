/* Krisna Kirtan Castro Vivar
    24 de febrero 2026
    en este ejecicio se aprendio que los string hacen objetos inmutables donde y que la variable marcada por el nombre dels string es la referencia a ese objeto
    que cunado se crea un nuebo
 */

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Kirtan";
        System.out.println("nombre.length = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Kirtan\") = " + nombre.equals("Kirtan"));
        System.out.println("nombre.equals(\"kirtan\") = " + nombre.equals("kirtan"));
        System.out.println("nombre.equalsIgnoreCase(\"kirtan\") = " + nombre.equalsIgnoreCase("kirtan"));
        System.out.println("nombre.compareTo(\"Kirtan\") = " + nombre.compareTo("Kirtan"));
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); // da el caracte en la posisicion 0 en este casp
        System.out.println("nombre.charAt(1) = " + nombre.charAt(2));
        System.out.println("nombre.charAt(nombre.length()) = " + nombre.charAt(nombre.length()-1)); // este da el ultimo caracter de manrea dinamica

        System.out.println("nombre.substring(1) = " + nombre.substring(1)); // te da el dato a apartir del caracte nuemro 1 en este caso
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4)); // te da el dato a partir del caracter q hasta el caracter 4
        System.out.println("nombre.substring(nombre.length()-4, nombre.length()/1 = " + nombre.substring(nombre.length()-4, nombre.length()));  // el substring excluye el iltimo caracter por eso es importante dejar el .length sin el -1 al final pero si incluye el primero


        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        // trabalenguas = trabalenguas.toUpperCase();
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf(\"A\") = " + trabalenguas.indexOf("A")); //busca la posisicon de un caracter dado
        System.out.println("trabalenguas.lastIndexOf(\"U\") = " + trabalenguas.lastIndexOf("U")); // busca la ultima incidencia de el valot dado y da la posicion
        System.out.println("trabalenguas.contains(\"aba\") = " + trabalenguas.contains("ABA")); // busca una secuencia de caracteres en el string y da true o false como respuesta
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        trabalenguas = "     trabalenguas     ";
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.trim() = " + trabalenguas.trim());




    }
}
