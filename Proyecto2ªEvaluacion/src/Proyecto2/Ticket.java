package Proyecto2;

import java.time.LocalDate;
import java.util.Date;

public class Ticket {
    protected int id;
    static int cont = 0;
    protected String Matricula;
    protected LocalDate entrada;
    protected int fila;
    protected int columna;
    protected int planta;
    public Ticket(){

    }
    public Ticket(String matricula, LocalDate entrada,int fila,int columna,int planta) {
        setId(cont);
        cont++;
        Matricula = matricula;
        this.entrada = entrada;
        this.fila=fila;
        this.columna=columna;
        this.planta=planta;

    }

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

    public boolean compareTo(Ticket nuevo) {

        return this.Matricula.equals(nuevo.Matricula);
    }
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

