public class ObjetosDePersona {

    //HECHO POR JUAN PABLO DE JESÚS AVENDAÑO BUSTAMANTE A LAS 10:21 AM DEL 26 / 02 / 2024


    /*
        ABSTRACCIÓN: LINEA 3 - CLASE PERSONA
        POLIMORFISMO: LINEA 22 - CLASE PERSONA
        HERENCIA: LINEA 13 - CLASE ObjetosDePersona
        ENCAPSULAMIENTO: LINEA 10 - CLASE PERSONA

     */


    public static void main(String[] args) {
        int contador = 1;
        //SE HACE USO DE LA HERENCIA, LOS DATOS CREADOS ADOPTAN LAS ACCIONES Y CARACTERISTICAS DE LA CLASE 'Persona'.
        Persona persona1 = new Persona("Mike", (short) 16, "Estudiante", 1.75f, 70f); //Se crea una instancia de la clase Persona
        Persona persona2 = new Persona("Ernesto", (short) 34, "Docente", 1.70f, 80f); // Se crea una instancia de la clase Persona
        Persona persona3 = new Persona("Carlos", (short) 60, "Administrativo", 1.60f, 75f); //Se crea una instancia de la clase Persona (por el segundo constructor)
        Persona persona4 = new Persona("Maria");
        Utilidades.limpiarPantalla(); //Limpia la pantalla;
        System.out.println("========================= BIENVENIDA =========================\n\nBienvenido al programa, usted verá a distintas personas hacer acciones a continuación. ");
        Utilidades.congelarPantalla(); //Realiza iteraciones repetitivas para simular que la pantalla se congela
        Utilidades.limpiarPantalla();
        persona1.mostrarDatos(1); //Muestra los datos de la persona 1
        Utilidades.congelarPantalla();
        Utilidades.limpiarPantalla();
        persona2.mostrarDatos(2); //Muestra los datos de la persona 2
        Utilidades.congelarPantalla();
        Utilidades.limpiarPantalla();
        persona3.mostrarDatos(3); //Muestra los datos de la persona 3
        Utilidades.congelarPantalla();
        Utilidades.limpiarPantalla();
        persona4.mostrarDatos(4); //Muestra los datos de la persona 4
        Utilidades.congelarPantalla();
        Utilidades.limpiarPantalla();

    }

}
