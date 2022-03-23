package Proyecto2;

public class DepositoDinero {
    private  int Monedas05;//Monedas de 5 cent
    private  int Monedas10;//Monedas de 10 cent
    private  int Monedas20;//Monedas de 20 cent
    private  int Monedas50;//Monedas de 50 cent
    private  int Monedas100;//Monedas de 1€
    private  int Monedas200;//Monedas de 2€
    private  int Billete5;//Billete de 5€
    private  int Billete10;//Billete de 10€
    private  int Billete20;//Billete de 20€
    private int c1, c2, c3, c4, c5, c6, c7, c8, c9 =0;//Variables que utiliza el programa para contar las veces que se modifican las
                                                        //variables a la hora de delvolver el dinero
    protected double Vueltas;//Variable que almacena la vuelta que hay que dar cuando se realice el pago

    //Constructor del Deposito el cual se construye con 100 monedas y 100 billetes de cada
    public DepositoDinero() {
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
        this.Monedas200 = monedas200;
    }
    public int getBillete5() {
        return Billete5;
    }
    public void setBillete5(int billete5) {
        this.Billete5 = billete5;
    }
    public int getBillete10() {
        return Billete10;
    }
    public void setBillete10(int billete10) {
        this.Billete10 = billete10;
    }
    public int getBillete20() {
        return Billete20;
    }
    public void setBillete20(int billete20) {
        this.Billete20 = billete20;
    }

    //Metodo que se encarga de dar las vueltas a la hora de realizar el pago del parking
    public boolean darVuelta(double coste,double entregado){

        boolean run=true;
        this.setVueltas(entregado-coste);//Establece la vuelta como la diferencia entre el precio y lo entregado
        resetValores();//Resetea los contadores de uso(c1,c2....)
        do{
            //Comprueba la mayor unidad monetaria que puede devolver
            if(this.getVueltas()-20>=0 && this.Billete20>0){
                this.setVueltas(modificar(this.Vueltas,20));//Modifica la vuelta
                this.setBillete20(this.Billete20-1);//Modifica la cantidad de dinero restante en el deposito
                c9++;//Aumenta el contador de uso de esta unidad en concreto
            }else if(this.getVueltas()-10>=0 && this.Billete10>0){
                this.setVueltas(modificar(this.Vueltas,10));
                this.setBillete10(this.Billete10-1);
                c8++;
            }else if(this.getVueltas()-5>=0 && this.Billete5>0){
                this.setVueltas(modificar(this.Vueltas,5));
                this.setBillete5(this.Billete5-1);
                c7++;
            }else if(this.getVueltas()-2>=0 && this.Monedas200>0){
                this.setVueltas(modificar(this.Vueltas,2));
                this.setMonedas200(this.Monedas200-1);
                c6++;
            }else if(this.getVueltas()-1>=0 && this.Monedas100>0){
                this.setVueltas(modificar(this.Vueltas,1));
                this.setMonedas100(this.Monedas100-1);
                c5++;
            }else if(this.getVueltas()-0.5>=0 && this.Monedas50>0){
                this.setVueltas(modificar(this.Vueltas,0.5));
                this.setMonedas50(this.Monedas50-1);
                c4++;
            }else if(this.getVueltas()-0.2>=0 && this.Monedas20>0){
                this.setVueltas( modificar(this.Vueltas,0.2));
                this.setMonedas20(this.Monedas20-1);
                c3++;
            }else if(this.getVueltas()-0.1>=0 && this.Monedas10>0){
                this.setVueltas(modificar(this.Vueltas,0.1));
                this.setMonedas10(this.Monedas10-1);
                c2++;
            }else if(this.getVueltas()-0.05>=0 && this.Monedas05>0) {
                this.setVueltas(modificar(this.Vueltas, 0.05));
                this.setMonedas05(this.Monedas05 - 1);
                c1++;
            }
            else{
                mostrarVueltas();
                System.out.println("No queda más dinero para devolver");
                System.out.println("Sentimos las molestias");
                return run;
            }
            if(this.Vueltas==0){
                //Cuando la vuelta es 0 muestra como se han dado las vueltas y finaliza el bucle
                mostrarVueltas();
                return run;
            }
        }while (run);
        return true;
    }
    public void mostrarVueltas(){
        //En caso de que se haya iniciado algun contador muestra cuanto se ha dado de cada moneda
        if(c1>0){
            System.out.println("Se han devuelto "+c1+" monedas de 5 céntimos");
        }
        if(c2>0){
            System.out.println("Se han devuelto "+c2+" monedas de 10 céntimos");
        }
        if(c3>0){
            System.out.println("Se han devuelto "+c3+" monedas de 20 céntimos");
        }
        if(c4>0){
            System.out.println("Se han devuelto "+c4+" monedas de 50 céntimos");
        }
        if(c5>0){
            System.out.println("Se han devuelto "+c5+" monedas de 1 euro");
        }
        if(c6>0){
            System.out.println("Se han devuelto "+c6+" monedas de 2 euros");
        }
        if(c7>0){
            System.out.println("Se han devuelto "+c7+" billetes de 5 euros");
        }
        if(c8>0){
            System.out.println("Se han devuelto "+c8+" billetes de 10 euros");
         }
        if(c9>0){
            System.out.println("Se han devuelto "+c9+" billetes de 20 euros");
          }
    }
    public void resetValores(){
        //Pone a cero todos los contadores
        this.c1 = 0;
        this.c2 = 0;
        this.c3 = 0;
        this.c4 = 0;
        this.c5 = 0;
        this.c6 = 0;
        this.c7 = 0;
        this.c8 = 0;
        this.c9 = 0;
    }
    public  double modificar(double dinero,double eliminado){
        //Resta el dinero introducido(Las vueltas) y le resta la unidad monetaria indicada como parametro y devuelve el resultado de la sustraccion
        dinero-=(eliminado);
        return dinero;
    }
}
