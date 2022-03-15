package Proyecto2;
import java.util.Scanner;
//Clase creada para la reutilización de codigo y realizar desde la misma todas las introducciones de datos
public class IntroducirDatos {
    //Scanner desde el que se realizan las entradas de datos
    static Scanner tc = new Scanner(System.in);

    //Cada metodo devuelve los datos introducidos tras mostrar antes la razón de la introducción de los mismos

    public  static String introducirStrings(String msg){
        System.out.println(msg);
        String temp = tc.nextLine();
        return temp;
    }

    public static int introducirInts(String msg){
            System.out.println(msg);
                int temp = Integer.parseInt(tc.nextLine());
                //Los datos se introducen como String pero se realiza un Parse para la comprobación de la validez de los datos
            return temp;

    }

    public static double introducirDoubles(String msg){
        System.out.println(msg);
        double temp = Double.parseDouble(tc.nextLine());
        return temp;
    }
    //Metodo empleado para rellenar una matriz con un Ticket determinado
    public static void rellenar(Ticket[][] a,Ticket o){

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = o;
            }
        }

    }
}
