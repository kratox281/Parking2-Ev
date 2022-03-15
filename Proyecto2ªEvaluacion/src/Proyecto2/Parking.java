package Proyecto2;

import java.time.LocalDate;

public class Parking {
    protected Ticket planta1[][] = new Ticket[4][5];
    protected Ticket planta2[][] = new Ticket[4][5];
    protected Ticket planta3[][] = new Ticket[4][5];
    protected LocalDate hoy = LocalDate.now();
    protected DepositoInutil deposito = new DepositoInutil();
    private Ticket vacio= new Ticket("",hoy,0,0,0);

    public Parking() {
        IntroducirDatos.rellenar(planta1,vacio);
        IntroducirDatos.rellenar(planta2,vacio);
        IntroducirDatos.rellenar(planta3,vacio);
    }

    public boolean MeterCocheP1(String Matricula) {
        for (int i = 0; i < planta1.length; i++) {
            for (int j = 0; j < planta1[0].length; j++) {
                if(planta1[i][j].compareTo(vacio)){
                    this.planta1[i][j]=new Ticket(Matricula,hoy,i,j,1);
                    System.out.println("El coche está en la primera planta");
                    System.out.println("Su ticket es el siguiente,recuerdelo bien");
                    planta1[i][j].imprimirTicket();

                    return true;
                }
            }
        }
        MeterCocheP2(Matricula);
        return false;
    }
    public boolean MeterCocheP2(String Matricula) {
        for (int i = 0; i < planta2.length; i++) {
            for (int j = 0; j < planta2[0].length; j++) {
                if(planta2[i][j].compareTo(vacio)){
                    this.planta2[i][j]=new Ticket(Matricula,hoy,i,j,2);;
                    System.out.println("El coche está en la segunda planta");
                    System.out.println("Su ticket es el siguiente,recuerdelo bien");
                    planta2[i][j].imprimirTicket();
                    return true;
                }
            }
        }
        MeterCocheP3(Matricula);
        return false;
    }
    public boolean MeterCocheP3(String Matricula) {
        for (int i = 0; i < planta3.length; i++) {
            for (int j = 0; j < planta3[0].length; j++) {
                if(planta3[i][j].compareTo(vacio)){
                    this.planta3[i][j]=new Ticket(Matricula,hoy,i,j,3);
                    System.out.println("El coche está en la tercera planta");
                    System.out.println("Su ticket es el siguiente,recuerdelo bien");
                    planta3[i][j].imprimirTicket();
                    return true;
                }
            }
        }
        System.out.println("No hay hueco en ninguna de las 3 plantas");
        return false;
    }
    public boolean retirarCocheP1(int id){
        try {
            double precio = coste();
            pagar(precio,IntroducirDatos.introducirDoubles("Introduzca el dinero necesario para pagar"));
            for (int i = 0; i < planta1.length; i++) {
                for (int j = 0; j <planta1[0].length; j++) {
                    if (planta1[i][j].getId()==id){
                        System.out.println("Se eliminará el vehiculo con la siguiente informacion");
                        System.out.println(planta1[i][j].toString());
                        planta1[i][j] = vacio;
                        return true;
                    }
                }
            }
            retirarCocheP2(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return false;
    }
    public boolean retirarCocheP2(int id){
        for (int i = 0; i < planta2.length; i++) {
            for (int j = 0; j <planta2[0].length; j++) {
                if (planta2[i][j].getId()==id){
                    System.out.println("Se eliminará el vehiculo con la siguiente informacion");
                    System.out.println(planta2[i][j].toString());
                    planta2[i][j] = vacio;
                    return true;
                }
            }
        }
        retirarCocheP3(id);
        return false;
    }
    public boolean retirarCocheP3(int id){
        for (int i = 0; i < planta3.length; i++) {
            for (int j = 0; j <planta3[0].length; j++) {
                if (planta3[i][j].getId()==id){
                    System.out.println("Se eliminará el vehiculo con la siguiente informacion");
                    System.out.println(planta3[i][j].toString());
                    planta3[i][j] = vacio;
                    return true;
                }
            }
        }
        System.out.println("El id introducido no es valido");
        return false;
    }
    public double coste(){
        int min = IntroducirDatos.introducirInts("Introduzca cuantos minutos ha estado");
        System.out.println("El importe asciende a: "+min*0.5+"€");
        return min*0.5;
    }
    public void pagar(double coste,double introducido) throws ParkingException{
        if (coste>introducido){
            throw new ParkingException("El dinero introducido es menor que el coste");
        }else{
            deposito.darVuelta(coste,introducido);
        }
    }

    public void mostrarParking(){
        System.out.println("PRIMERA PLANTA");
        System.out.println("---------------------------------");
        for (int i = 0; i < planta1.length; i++) {
            for (int j = 0; j <planta1[0].length; j++) {
                if(planta1[i][j].compareTo(vacio)){
                    System.out.print("║ ║");
                }
                else{
                    System.out.print("║█║");
                }
                }
            System.out.println();
            }
        System.out.println("SEGUNDA PLANTA");
        System.out.println("---------------------------------");
        for (int i = 0; i < planta1.length; i++) {
            for (int j = 0; j <planta1[0].length; j++) {
                if(planta2[i][j].compareTo(vacio)){
                    System.out.print("║ ║");
                }
                else{
                    System.out.print("║█║");
                }
            }
            System.out.println();
        }
        System.out.println("TERCERA PLANTA");
        System.out.println("---------------------------------");
        for (int i = 0; i < planta1.length; i++) {
            for (int j = 0; j <planta1[0].length; j++) {
                if(planta3[i][j].compareTo(vacio)){
                    System.out.print("║ ║");
                }
                else{
                    System.out.print("║█║");
                }
            }
            System.out.println();
        }

    }
}


