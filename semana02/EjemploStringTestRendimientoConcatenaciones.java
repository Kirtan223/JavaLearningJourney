package semana02;/* Krisna Kirtan Castro Vivar
23 de febrero del 2026
 este ejercio pretende demostrar que la concatenacion con .concat es mas eficiente que concatenra
solo con + y que el Stringbuilder es mas rapido que .concat
buscnado en otras funetes se encontro que normalmente se usa
+ concatenaciones simples
StrinBuilder concatenaciones dentro de loops
.concat casi nunca solo cuando se quiere demostrar que se esta haiendo

 */

public class EjemploStringTestRendimientoConcatenaciones {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;
        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for ( int i = 0; i < 500; i++){
        //    c = c.concat(a).concat(b).concat("\n"); //tardo 1 ms
        // c+=a+b+"\n"; // tardo 4 ms
        // sb.append(a).append(b).append("\n"); // tardo 0 ms
        

        }

        long fin = System.currentTimeMillis();

        System.out.println( fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString() ) ;





    }
    }