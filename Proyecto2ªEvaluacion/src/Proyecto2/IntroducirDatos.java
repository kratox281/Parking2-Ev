package Proyecto2;
import java.util.Arrays;
import java.util.Scanner;
public class IntroducirDatos {

    static Scanner tc = new Scanner(System.in);

    public  static String introducirStrings(String msg){
        System.out.println(msg);
        return tc.nextLine();
    }

    public static int introducirInts(String msg){
        System.out.println(msg);
        return tc.nextInt();
    }

    public static double introducirDoubles(String msg){
        System.out.println(msg);
        return tc.nextDouble();
    }
    public static void rellenar(Ticket[][] a,Ticket o){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = o;
            }
        }

    }
}
