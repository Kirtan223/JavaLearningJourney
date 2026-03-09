package semana03;

import java.lang.Character;

public class Tarea02_1 {
    public static void main(String[] args) {


        if (args.length != 3) {
            System.out.println("Debe ingresar exactamente 3 nombres");
            return;
        }

        String resultado = "";

        for (int i = 0; i < args.length; i++) {

            String nombre = args[i];

            if (nombre.length() < 3) {
                System.out.println("El nombre " + nombre + " debe tener al menos 3 letras");
                return;
            }

            char segunda = Character.toUpperCase(nombre.charAt(1));
            String ultimosDos = nombre.substring(nombre.length() - 2);

            String nuevo = segunda + "." + ultimosDos;

            if (i < args.length - 1) {
                resultado += nuevo + "_";
            } else {
                resultado += nuevo;
            }
        }

        System.out.println(resultado);
    }
}
