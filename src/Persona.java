public class Persona {

    //EN ESTA CLASE SE VE EVIDENCIADA LA ABSTRACCION, ESTAMOS MODELANDO OBJETOS DE LA VIDA REAL CON ATRIBUTOS Y ACCIONES.
    private String nombre;
    private short edad;
    private String ocupacion;
    private float altura;
    private float peso;

    //EN LAS LINEAS ANTERIORES SE HIZO USO DE EL ENCAPSULAMIENTO, SE PROTEGIERON LOS DATOS DE SER ACCEDIDOS FUERA DE LA CLASE
    //EN VEZ DE ACCEDERSE DIRECTAMENTE SE DEBE LLAMAR UN METODO QUE REALICE ESTA ACCIÓN


    //Constructor
    public Persona(String nombre, short edad, String ocupacion, float altura, float peso){
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.altura = altura;
        this.peso = peso;
    }
    //SE HACE USO DEL POLIMORFISMO, SE CREA UN METODO (EN ESTE CASO EL CONSTRUCTOR) Y SE EJECUTA DE DISTINTAS MANERAS SEGÚN SUS PARAMETROS.
    public Persona(String nombre){
        this.nombre = nombre;
        this.edad = 0;
        this.ocupacion = "Ninguna";
        this.altura = 0.7f;
        this.peso = 0.5f;
    }

    public String comer(){ //Verifica si la persona puede comer, en tal caso hace que coma.
        if(this.edad > 2){
            return "La persona ha comido correctamente";
        }
        else{
            return "La persona no puede comer debido a que su edad es muy poca";
        }
    }

    public String saltar(){ //Verifica si la persona puede saltar, en tal caso hace que salte.
        if(this.getEdad() > 3 && this.getPeso() < 98 && this.getPeso() > 20){
            return "Ha saltado correctamente";
        }
        else{
            return "No puede saltar debido a su edad o peso";
        }
    }

    public String mayorEdad(){ //Verifica si la persona es mayor de edad
        if(this.getEdad() > 18) return "La persona es mayor de edad";
        else return "La persona no es mayor de edad";
    }

    public void mostrarDatos(int nroPersona){ //Imprime los datos de la persona
        System.out.println("============================== PERSONA " + nroPersona + " ==============================");
        System.out.print("\nNombre: " + this.getNombre());
        System.out.print("\nEdad: " + this.getEdad() + " años");
        System.out.print("\nOcupación: " + this.getOcupacion());
        System.out.print("\nAltura: " + this.getAltura() + " metros");
        System.out.print("\nPeso: " + this.getPeso() + " kilogramos");
        System.out.println("\n\n---------- Acciones ----------");
        System.out.print("\nSalta: " + this.saltar());
        System.out.print("\nComer: " + this.comer());
        System.out.print("\nEs mayor de edad: " + this.mayorEdad());
    }







    //Setter's & Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
