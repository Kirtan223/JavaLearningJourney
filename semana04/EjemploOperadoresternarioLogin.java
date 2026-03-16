/* Krisna Kirtan Castro Vivar
12 de marzo 2026
en este ejmplo se vera con un pequeno ejercicio mejorado al ejemplo de ocmo hacer un login rudimetario
\en donde se veran como funcioan las precedencias de los operadores logicos
 */

package semana04;

import java.util.Scanner;

public class EjemploOperadoresternarioLogin {
    public static void main(String[] args) {

        String[] userNames = new String[2];
        String[] pasWords = new String[2];

        userNames[0] = "andres";
        pasWords[0] = "123pepe";
        userNames[1] = "jorge";
        pasWords[1] = "123jorge";

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el user name:");
            String u = scanner.next();

            System.out.println("Ingrese el password:");
            String p = scanner.next();

            boolean esAutenticado = false;

            for (int j = 0; j < userNames.length; j++) {
                if (userNames[j].equals(u) && pasWords[j].equals(p)) {
                    esAutenticado = true;
                    break;
                }
            }

            String RespTernario = esAutenticado ? "bienvenido usuario " + u : "user name o contrasena incorrecta"; // aqu se puede apreciar como en este caso fue mucho mas eficiente utilizr un operador ternario
            System.out.println("Estado = " + RespTernario);
            break;
           /* if (esAutenticado) {
                System.out.println("Bienvenido usuario " + u);
                break;
            } else {
                System.out.println("User name o contrasena incorrecta");

            */
            }
        }

        
    }
