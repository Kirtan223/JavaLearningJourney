package semana03;

public class OperadoresDeAsignacion {
    public static void main(String[] args) {
         int i = 5;
         int j = i + 4;
        System.out.println("j = " + j);
        System.out.println("i = " + i);

         i += 2; // que es lo mismo que poner i = i +2;
        System.out.println("i + 2 = " + i);

        i += 5;
        System.out.println("i + 5 = " + i);

        j -= 4; // es lo mismo que j = j - 4;
        System.out.println("j - 4 = " + j);

        j *= 4;
        System.out.println("j * 4 = " + j);

        i /= 4;
        System.out.println("j / 4 = " + j);

        String sqlString = "select * from clientes  as c"; // tambien se pueden usar operadores de asignacion para string y concatenar strings
        sqlString    += "where c.nombre = 'andres' ";
        sqlString  += "and c.activo1";
        System.out.println("sqlString = " + sqlString);



    }
}
