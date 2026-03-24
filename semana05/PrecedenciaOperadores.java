/*
Krisna kirtan Castro Vivar
17 de marzo 2026
en este ejempli se veran en que orden ser resuelven los operadores

 */
package semana05;

public class PrecedenciaOperadores {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = i + j + k / 3;   //  en este caso se obever que se resuelve por genrarquias matematicas primero se resolvio la dicion y despues la suma
        System.out.println("promedio = " + promedio);

        promedio = (i + j + k) / 3; // aqui ya se resulve en orden oncrrecto
        System.out.println("promedio = " + promedio);

        promedio = i + j + k / 3 * 10; // el orden seria ir de izquierda a derecahr con divicion y depues miltiplicacion
        System.out.println("promedio = " + promedio); // es decir k / 3 = 6.6666 pero al ser k un int se toma solo en entro 6 duepues por 10 = 60 y finalmente la suma de i y j = 82

        promedio = ++i + j-- + k / 3 * 10; // en este caso primero van los incrementes por gerarquia y despues las multiplicaciones y diviones
        System.out.println("promedio = " + promedio); // entonces primero se asignan valores i = 15 por ser pre j = 8 aun no se incemnte por ser post despues de hace la div. 20 / 3
        // que da 6 por ser un int y se multiplica por 10 da 60 y finalmente se suma 15 y 8 y da 83
    }
}