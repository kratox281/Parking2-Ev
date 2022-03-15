package Proyecto2;

import java.time.LocalDate;

public class Ticket {
    protected int id;//ID del ticket
    static int cont = 0;//Cuenta los tickets que se han creado, para despues otorgar a cada uno un ID único
    protected String Matricula;//Matricula del Vehiculo del vehiculo asociado al ticket
    protected LocalDate entrada;//Fecha de la impresión del ticket
    protected int fila;//Fila en la que se encuentra aparcado el vehículo
    protected int columna;//Columna en la que se encuentra aparcado el vehículo
    protected int planta;//Planta en la que se encuentra aparcado el vehículo
    //Constructor vacio de Tickets
    public Ticket(){

    }
    //Constructor completo de Tickets.
    public Ticket(String matricula, LocalDate entrada,int fila,int columna,int planta) {
        setId(cont);
        cont++;
        Matricula = matricula;
        this.entrada = entrada;
        this.fila=fila+1;
        this.columna=columna+1;
        this.planta=planta;

    }

    //Getter & Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public LocalDate getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDate entrada) {
        this.entrada = entrada;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    //Compara diferentes objetos Tickets mediante la matricula del vehículo al que está asociado
    public boolean compareTo(Ticket nuevo) {
        return this.Matricula.equals(nuevo.Matricula);
    }
    //Imprime el Ticket de una forma más visual y/o estetica
    public void imprimirTicket(){
        System.out.println("┌---------------------------------------------┐");
        System.out.println("|                    Ticket                   |");
        System.out.println("|                                             |");
        System.out.println("|     MATRICULA: "+this.Matricula);
        System.out.println("|                                             |");
        System.out.println("|     ID:" + this.id);
        System.out.println("|                                             |");
        System.out.println("|     ENTRADA:" + this.entrada);
        System.out.println("|                                             |");
        System.out.println("|     FILA:" + this.fila);
        System.out.println("|                                             |");
        System.out.println("|     COLUMNA:"+this.columna);
        System.out.println("|                                             |");
        System.out.println("|     PLANTA:"+this.planta);
        System.out.println("|                                             |");
        System.out.println("|                                             |");
        System.out.println("└---------------------------------------------┘");
    }
    @Override
    //Metodo toString
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", Matricula='" + Matricula + '\'' +
                ", entrada=" + entrada +
                ", fila=" + fila +
                ", columna=" + columna +
                ", planta=" + planta +
                '}';
    }
}

