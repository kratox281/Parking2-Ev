package Proyecto2;

public class DepositoDinero {
    protected  int Monedas01;
    protected  int Monedas02;
    protected  int Monedas05;
    protected  int Monedas10;
    protected  int Monedas20;
    protected  int Monedas50;
    protected  int Monedas100;
    protected  int Monedas200;
    protected  int Billete5;
    protected  int Billete10;
    protected  int Billete20;
    protected  int Billete50;
    protected  int Billete100;
    protected  int Billete200;
    protected  int Billete500;
    protected double Vueltas;

    public double getVueltas() {
        return Vueltas;
    }

    public void setVueltas(double vueltas) {
        Vueltas = vueltas;
    }

    public DepositoDinero() {
        setBillete5(100);
        setBillete10(100);
        setBillete20(100);
        setBillete50(100);
        setBillete100(100);
        setBillete200(100);
        setBillete500(100);
        setMonedas01(100);
        setMonedas02(100);
        setMonedas05(100);
        setMonedas10(100);
        setMonedas20(100);
        setMonedas50(100);
        setMonedas100(100);
        setMonedas200(100);
    }

    public int getMonedas01() {
        return Monedas01;
    }

    public void setMonedas01(int monedas01) {
        Monedas01 = monedas01;
    }

    public int getMonedas02() {
        return Monedas02;
    }

    public void setMonedas02(int monedas02) {
        Monedas02 = monedas02;
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

    public int getBillete50() {
        return Billete50;
    }

    public void setBillete50(int billete50) {
        Billete50 = billete50;
    }

    public int getBillete100() {
        return Billete100;
    }

    public void setBillete100(int billete100) {
        Billete100 = billete100;
    }

    public int getBillete200() {
        return Billete200;
    }

    public void setBillete200(int billete200) {
        Billete200 = billete200;
    }

    public int getBillete500() {
        return Billete500;
    }

    public void setBillete500(int billete500) {
        Billete500 = billete500;
    }

    public void darVuelta(double coste,double entregado){

        this.setVueltas(entregado-coste);
        System.out.println(this.getVueltas());
        System.out.println(this.getVueltas()*100);
        do{
            if((this.getVueltas()-500 )> 0){
                this.setVueltas(modificar(this.getVueltas(),500));
            }else if(this.getVueltas()-200 >0){
                this.setVueltas(modificar(this.getVueltas(),200));
            }else if(this.getVueltas()-100>0){
                this.setVueltas(modificar(this.getVueltas(),100));
            }else if(this.getVueltas()-50>0){
                this.setVueltas(modificar(this.getVueltas(),50));
            }else if(this.getVueltas()-20>0){
                this.setVueltas(modificar(this.getVueltas(),20));
            }else if(this.getVueltas()-10>0){
                this.setVueltas(modificar(this.getVueltas(),10));
            }else if(this.getVueltas()-5>0){
                this.setVueltas(modificar(this.getVueltas(),5));
            }else if(this.getVueltas()-2>0){
                this.setVueltas(modificar(this.getVueltas(),2));
            }else if(this.getVueltas()-1>0){
                this.setVueltas(modificar(this.getVueltas(),1));
            }else if(this.getVueltas()-0.5>0){
                this.setVueltas(modificar(this.getVueltas(),0.5));
            }else if(this.getVueltas()-0.2>0){
                this.setVueltas( modificar(this.getVueltas(),0.2));
            }else if(this.getVueltas()-0.1>0){
                this.setVueltas(modificar(this.getVueltas(),0.1));
            }else if(this.getVueltas()-0.05>0){
                this.setVueltas(modificar(this.getVueltas(),0.05));
            }else if(this.getVueltas()-0.02 >0){
                this.setVueltas(modificar(this.getVueltas(),0.02));
            }else if(this.getVueltas()-0.01>0){
                this.setVueltas(modificar(this.getVueltas(),0.01));
            }

        }while (this.getVueltas()!=0);
    }
    public  double modificar(double dinero,double eliminado){
        dinero-=(eliminado);
        System.out.println("Se han dado "+eliminado+" €");
        return dinero;
    }
}
