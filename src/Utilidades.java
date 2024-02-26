public class Utilidades {
    public static void congelarPantalla(){ //SIMULA LA CONGELACIÓN DE LA PANTALLA
        for(int contador = 0; contador < 99999999; contador++){
            System.out.print("");
        }
    }
    public static void limpiarPantalla(){ //SIMULA LIMPIAR LA CONSOLA
        for(int contador = 0; contador < 50; contador++){
            System.out.println("\n");
        }
    }
}
