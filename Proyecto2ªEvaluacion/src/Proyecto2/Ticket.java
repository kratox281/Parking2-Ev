package Proyecto2;

import java.util.Date;

public class Ticket {
    protected int id;
    public int cont = 0;
    protected String Matricula;
    protected Date entrada;
    protected int fila;
    protected int columna;
    protected int planta;

    public Ticket(String matricula, Date entrada,int fila,int columna,int planta) {
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

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
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
}
