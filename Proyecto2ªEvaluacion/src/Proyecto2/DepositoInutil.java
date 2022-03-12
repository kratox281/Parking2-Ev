package Proyecto2;

public class DepositoInutil {
    protected  int Monedas01;//Monedas de 1 cent
    protected  int Monedas02;//Monedas de 2 cent
    protected  int Monedas05;//Monedas de 5 cent
    protected  int Monedas10;//Monedas de 10 cent
    protected  int Monedas20;//Monedas de 20 cent
    protected  int Monedas50;//Monedas de 50 cent
    protected  int Monedas100;//Monedas de 1€
    protected  int Monedas200;//Monedas de 2€
    protected  int Billete5;//Billete de 5€
    protected  int Billete10;//Billete de 10€
    protected  int Billete20;//Billete de 20€
    protected  int Billete50;//Billete de 50€
    protected  int Billete100;//Billete de 100€
    protected  int Billete200;//Billete de 200€
    protected  int Billete500;//Billete de 500€
    protected double Vueltas;//Variable que almacena la vuelta que hay que dar cuando se realice el pago
    //Constructor del Deposito el cual se construye con 100 monedas y 100 billetes de cada
    public DepositoInutil() {
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
    //Setters & getters de las variables
    public double getVueltas() {
        return Vueltas;
    }
    public void setVueltas(double vueltas) {
        Vueltas = vueltas;
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
            if((this.getVueltas()-500 )> 0 && this.getBillete500()>0){
                this.setVueltas(modificar(this.getVueltas(),500));
                this.setBillete500(this.Billete500-1);

            }else if(this.getVueltas()-200 >0 && this.getBillete200()>0){
                this.setVueltas(modificar(this.getVueltas(),200));
                this.setBillete200(this.Billete200-1);

            }else if(this.getVueltas()-100>0 && this.getBillete100()>0){
                this.setVueltas(modificar(this.getVueltas(),100));
                this.setBillete100(this.Billete100-1);

            }else if(this.getVueltas()-50>0 && this.getBillete50()>0){
                this.setVueltas(modificar(this.getVueltas(),50));
                this.setBillete50(this.Billete50-1);

            }else if(this.getVueltas()-20>0 && this.getBillete20()>0){
                this.setVueltas(modificar(this.getVueltas(),20));
                this.setBillete20(this.Billete20-1);

            }else if(this.getVueltas()-10>0 && this.getBillete10()>0){
                this.setVueltas(modificar(this.getVueltas(),10));
                this.setBillete10(this.Billete10-1);

            }else if(this.getVueltas()-5>0 && this.getBillete5()>0){
                this.setVueltas(modificar(this.getVueltas(),5));
                this.setBillete5(this.Billete5-1);

            }else if(this.getVueltas()-2>0 && this.getMonedas200()>0){
                this.setVueltas(modificar(this.getVueltas(),2));
                this.setMonedas200(this.Monedas200-1);

            }else if(this.getVueltas()-1>0 && this.getMonedas100()>0){
                this.setVueltas(modificar(this.getVueltas(),1));
                this.setMonedas100(this.Monedas100-1);

            }else if(this.getVueltas()-0.5>0 && this.getMonedas50()>0){
                this.setVueltas(modificar(this.getVueltas(),0.5));
                this.setMonedas50(this.Monedas50-1);

            }else if(this.getVueltas()-0.2>0 && this.getMonedas20()>0){
                this.setVueltas( modificar(this.getVueltas(),0.2));
                this.setMonedas20(this.Monedas20-1);

            }else if(this.getVueltas()-0.1>0 && this.getMonedas10()>0){
                this.setVueltas(modificar(this.getVueltas(),0.1));
                this.setMonedas10(this.Monedas10-1);
            }else if(this.getVueltas()-0.05>0 && this.getMonedas05()>0){
                this.setVueltas(modificar(this.getVueltas(),0.05));
                this.setMonedas05(this.Monedas05-1);

            }else if(this.getVueltas()-0.02 >0 && this.getMonedas02()>0){
                this.setVueltas(modificar(this.getVueltas(),0.02));
                this.setMonedas02(this.Monedas02-1);

            }else if(this.getVueltas()-0.01>0 && this.getMonedas01()>0){
                this.setVueltas(modificar(this.getVueltas(),0.01));
                this.setMonedas01(this.Monedas01-1);

            }//else{
               // System.out.println("Lo sentimos,no disponemos de cambio");
            //}

        }while (this.getVueltas()!=0);
    }
    public  double modificar(double dinero,double eliminado){
        dinero-=(eliminado);
        System.out.println("Se han dado "+eliminado+" €");
        return dinero;
    }
}
