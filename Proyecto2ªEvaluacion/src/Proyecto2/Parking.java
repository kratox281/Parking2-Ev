package Proyecto2;

import java.util.Date;

public class Parking {
    protected Ticket planta1[][] = new Ticket[4][5];
    protected Ticket planta2[][] = new Ticket[4][5];
    protected Ticket planta3[][] = new Ticket[4][5];
    private Ticket vacio= new Ticket("",new Date(0),0,0,0);

    public Parking() {

    }

    public Ticket[][] getPlanta1() {
        return planta1;
    }

    public void setPlanta1(Ticket[][] planta1) {
        this.planta1 = planta1;
    }

    public Ticket[][] getPlanta2() {
        return planta2;
    }

    public void setPlanta2(Ticket[][] planta2) {
        this.planta2 = planta2;
    }

    public Ticket[][] getPlanta3() {
        return planta3;
    }

    public void setPlanta3(Ticket[][] planta3) {
        this.planta3 = planta3;
    }

    public String introducirMatricula(){
        String mat ="";
        return mat;
    }
    public boolean MeterCocheP1() {
        for (int i = 0; i < planta1.length; i++) {
            for (int j = 0; j < planta1[0].length; j++) {
                if(planta1[i][j]!=vacio){
                    planta1[i][j]=new Ticket(introducirMatricula(),new Date(12),i,j,1);
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
                if(planta2[i][j]!=vacio){
                    planta2[i][j]=new Ticket(introducirMatricula(),new Date(12),i,j,2);
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
                if(planta3[i][j]!=vacio){
                    planta3[i][j]=new Ticket(introducirMatricula(),new Date(12),i,j,3);
                    return true;
                }
            }
        }
        System.out.println("No hay hueco en ninguna de las 3 plantas");
        return false;
    }
}


