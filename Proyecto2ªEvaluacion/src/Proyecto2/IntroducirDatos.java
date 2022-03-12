package Proyecto2;
import java.util.Scanner;
public class IntroducirDatos {

    Scanner tc = new Scanner(System.in);

    public String introducirStrings(String msg){
        System.out.println(msg);
        return tc.nextLine();
    }

    public int introducirInts(String msg){
        System.out.println(msg);
        return tc.nextInt();
    }

    public double introducirDoubles(String msg){
        System.out.println(msg);
        return tc.nextDouble();
    }
}
