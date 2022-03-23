package Proyecto2;

public class Terminal {
    static Maquina p = new Maquina(0.5);//Crea un parking sobre el que se van a ejecutar todas las funciones
    static int c = 0;//Variable que define el caso a elegir en el switch del menú,la cual es por defecto 0
    static boolean end = false;//Variable que establece la ejecución del bucle
    //Metodo menú el cual sirve para decidir las acciones a realizar
    public static void menu(){
        //Imprime la imagen de la P de parking a modo de bienvenida al terminal
        //Imagenes.imprimirBienvenida();
        do {
            //Muestra el estado actual del parking en las 3 plantas
            p.mostrarParking();
            try {
                c = IntroducirDatos.introducirInts("Que deseas realizar " +
                        "1:Meter un coche || 2: Sacar un coche");
            } catch (Exception e) {
                System.out.println("Error en la introducción de datos");
                c = 0;
            }

            switch (c) {
                case 1:
                    //Ejecuta el metodo para meter coches del parking creado al principio
                    p.MeterCocheP1(IntroducirDatos.introducirStrings("Introduce la Matricula del vehiculo NNNNLLL"));
                    break;
                case 2:
                    try {
                    //Ejecuta el metodo para sacar coches del parking creado al principio
                        p.retirarCocheP1(IntroducirDatos.introducirInts("Introduce el id del ticket del vehiculo a retirar"));
                    }catch (Exception ex){
                        System.out.println("Error en los datos");
                    }

                    break;
                default:
                    System.out.println("No reconocido");
                    break;
            }
        }while (!end);

    }
}
