public class Actor {

    //ATRIBUTOS

    String nombre;
    String apellido;
    String pais;
    int anio;

    //CONSTRUCTORES

    public Actor(String nombre, String apellido, String pais, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.anio = anio;
    }


    //METODOS

    public int calcularEdad(int anioActual) {
        int edad;
        edad = anioActual - this.anio;
        return edad;
    }

    @Override
    public String toString() {
        return "El Actor se llama" + this.nombre + this.apellido + "(" + this.pais + ")" ;
    }
}




