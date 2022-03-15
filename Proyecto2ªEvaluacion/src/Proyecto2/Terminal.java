package Proyecto2;

public class Terminal {
    static Parking p = new Parking();
    static int c = 0;
    static boolean end = false;
    public static void menu(){
        do {
            p.mostrarParking();
            try {
                c = IntroducirDatos.introducirInts("Que deseas realizar" +
                        "1:Meter un coche || 2: Sacar un coche");
            } catch (Exception e) {
                System.out.println("Error en la introducción de datos");
                end=true;
            }

            switch (c) {
                case 1:
                    p.MeterCocheP1(IntroducirDatos.introducirStrings("Introduce la Matricula del vehiculo"));
                    break;
                case 2:
                    p.retirarCocheP1(IntroducirDatos.introducirInts("Introduce el id del ticket del vehiculo a retirar"));
                    break;
                default:
                    System.out.println("No reconocido");
                    end=true;
                    break;
            }
        }while (!end);

    }
}
