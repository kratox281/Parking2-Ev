package Proyecto2;

public class DepositoInutil {
    protected  int Monedas05;//Monedas de 5 cent
    protected  int Monedas10;//Monedas de 10 cent
    protected  int Monedas20;//Monedas de 20 cent
    protected  int Monedas50;//Monedas de 50 cent
    protected  int Monedas100;//Monedas de 1€
    protected  int Monedas200;//Monedas de 2€
    protected  int Billete5;//Billete de 5€
    protected  int Billete10;//Billete de 10€
    protected  int Billete20;//Billete de 20€
    protected double Vueltas;//Variable que almacena la vuelta que hay que dar cuando se realice el pago
    //Constructor del Deposito el cual se construye con 100 monedas y 100 billetes de cada
    public DepositoInutil() {
        setBillete5(100);
        setBillete10(100);
        setBillete20(100);
        setMonedas05(100);
        setMonedas10(100);
        setMonedas20(100);
        setMonedas50(100);
        setMonedas100(100);
        setMonedas200(100);
    }
    //Setters & getters de las variables
    public double getVueltas() {
        return Vueltas;
    }
    public void setVueltas(double vueltas) {
        Vueltas = vueltas;
    }
    public int getMonedas05() {
        return Monedas05;
    }
    public void setMonedas05(int monedas05) {
        Monedas05 = monedas05;
    }
    public int getMonedas10() {
        return Monedas10;
    }
    public void setMonedas10(int monedas10) {
        Monedas10 = monedas10;
    }
    public int getMonedas20() {
        return Monedas20;
    }
    public void setMonedas20(int monedas20) {
        Monedas20 = monedas20;
    }
    public int getMonedas50() {
        return Monedas50;
    }
    public void setMonedas50(int monedas50) {
        Monedas50 = monedas50;
    }
    public int getMonedas100() {
        return Monedas100;
    }
    public void setMonedas100(int monedas100) {
        Monedas100 = monedas100;
    }
    public int getMonedas200() {
        return Monedas200;
    }
    public void setMonedas200(int monedas200) {
        Monedas200 = monedas200;
    }
    public int getBillete5() {
        return Billete5;
    }
    public void setBillete5(int billete5) {
        Billete5 = billete5;
    }
    public int getBillete10() {
        return Billete10;
    }
    public void setBillete10(int billete10) {
        Billete10 = billete10;
    }
    public int getBillete20() {
        return Billete20;
    }
    public void setBillete20(int billete20) {
        Billete20 = billete20;
    }
    public int c3,c4,c5,c6,c7,c8,c9,c10,c11=0;
    public void darVuelta(double coste,double entregado){

        this.setVueltas(entregado-coste);
        System.out.println(this.getVueltas());
        System.out.println(this.getVueltas()*100);
        do{
            if(this.getVueltas()-20>0 && this.getBillete20()>0){
                this.setVueltas(modificar(this.getVueltas(),20));
                this.setBillete20(this.Billete20-1);
                c11++;
            }else if(this.getVueltas()-10>0 && this.getBillete10()>0){
                this.setVueltas(modificar(this.getVueltas(),10));
                this.setBillete10(this.Billete10-1);
                c10++;
            }else if(this.getVueltas()-5>0 && this.getBillete5()>0){
                this.setVueltas(modificar(this.getVueltas(),5));
                this.setBillete5(this.Billete5-1);
                c9++;
            }else if(this.getVueltas()-2>0 && this.getMonedas200()>0){
                this.setVueltas(modificar(this.getVueltas(),2));
                this.setMonedas200(this.Monedas200-1);
                c8++;
            }else if(this.getVueltas()-1>0 && this.getMonedas100()>0){
                this.setVueltas(modificar(this.getVueltas(),1));
                this.setMonedas100(this.Monedas100-1);
                c7++;
            }else if(this.getVueltas()-0.5>0 && this.getMonedas50()>0){
                this.setVueltas(modificar(this.getVueltas(),0.5));
                this.setMonedas50(this.Monedas50-1);
                c6++;
            }else if(this.getVueltas()-0.2>0 && this.getMonedas20()>0){
                this.setVueltas( modificar(this.getVueltas(),0.2));
                this.setMonedas20(this.Monedas20-1);
                c5++;
            }else if(this.getVueltas()-0.1>0 && this.getMonedas10()>0){
                this.setVueltas(modificar(this.getVueltas(),0.1));
                this.setMonedas10(this.Monedas10-1);
                c4++;
            }else if(this.getVueltas()-0.05>0 && this.getMonedas05()>0) {
                this.setVueltas(modificar(this.getVueltas(), 0.05));
                this.setMonedas05(this.Monedas05 - 1);
                c3++;
            }

        }while (this.getVueltas()!=0);
    }
    public  double modificar(double dinero,double eliminado){
        dinero-=(eliminado);
        System.out.println("Se han dado "+eliminado+" €");
        return dinero;
    }
}
