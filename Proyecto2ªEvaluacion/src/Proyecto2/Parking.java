package Proyecto2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

public class Parking {
    protected Ticket planta1[][] = new Ticket[4][5];
    protected Ticket planta2[][] = new Ticket[4][5];
    protected Ticket planta3[][] = new Ticket[4][5];
    private Ticket vacio= new Ticket("",new Date(0),0,0,0);

    public Parking() {
        Arrays.fill(planta1,vacio);
        Arrays.fill(planta2,vacio);
        Arrays.fill(planta3,vacio);
    }

    public String introducirMatricula(){
        String mat ="";
        return mat;
    }
    public boolean MeterCocheP1() {
        for (int i = 0; i < planta1.length; i++) {
            for (int j = 0; j < planta1[0].length; j++) {
                if(planta1[i][j]==vacio){
                    this.planta1[i][j]=new Ticket(introducirMatricula(),new Date(12),i,j,1);
                    System.out.println("El coche está en la primera planta");
                    return true;
                }
            }
        }
        MeterCocheP2();
        return false;
    }
    public boolean MeterCocheP2() {
        for (int i = 0; i < planta2.length; i++) {
            for (int j = 0; j < planta2[0].length; j++) {
                if(planta2[i][j].compareTo(vacio)){
                    this.planta2[i][j]=new Ticket(introducirMatricula(),new Date(12),i,j,2);
                    System.out.println("El coche está en la segunda planta");
                    return true;
                }
            }
        }
        MeterCocheP3();
        return false;
    }
    public boolean MeterCocheP3() {
        for (int i = 0; i < planta3.length; i++) {
            for (int j = 0; j < planta3[0].length; j++) {
                if(planta3[i][j].compareTo(vacio)){
                    this.planta3[i][j]=new Ticket(introducirMatricula(),new Date(12),i,j,3);
                    System.out.println("El coche está en la tercera planta");
                    return true;
                }
            }
        }
        System.out.println("No hay hueco en ninguna de las 3 plantas");
        return false;
    }

    public void sacarCoche() {


    }
}


