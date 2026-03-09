package semana03;

import java.lang.Character;
import java.util.Scanner;

public class Tarea02 {
    public static void main(String[] args) {

        String[] nombres = new String[3];
        Scanner scan = new Scanner(System.in);


        for( int i = 0; i < 3; i++ ){
            System.out.println("ingrese solo su nombre sin apellidos");
            nombres[i] = scan.nextLine();
            int largoNombre = nombres[i].length();
            if(largoNombre<3 ){
                System.out.println("ingrese un nombre con al menos 3 letras");
                i--;                                                           // hasta donde tengo entendido no deberia usarse asi pero en este moemnto no tengo conocimiento de otra forma

            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 3; i++ ){
            int l = nombres[i].length();

            char charMinus, charMayus, ultima1, ultima2;

                charMinus = nombres[i].charAt(1);
                charMayus = Character.toUpperCase(charMinus);
                ultima1 = nombres[i].charAt(l-1);
                ultima2 = nombres[i].charAt(l-2);
                sb.append(charMayus);
                sb.append(".");
                sb.append(ultima2);
                sb.append(ultima1);
            if(i< nombres.length-1){
                sb.append("_");
            }



;        }
        System.out.println(sb.toString());

    }


}
