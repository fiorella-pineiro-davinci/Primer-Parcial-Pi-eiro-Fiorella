import java.util.ArrayList;

public class Pelicula {

    //ATRIBUTOS

    String titulo;
    int duracion;
    int anio;
    String categoria;
    ArrayList<Actor> actor = new ArrayList<Actor>();

    //CONSTRUCTORES

    public Pelicula(String titulo, int duracion, int anio, String categoria) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.anio = anio;
        this.categoria = categoria;
    }

    public Pelicula(String titulo) {
        this.titulo = titulo;
    }

    //METODOS

    public void agregarActores(Actor actor){
       this.actor.add(actor);
    }

    public void eliminarActores(Actor actor){
        this.actor.remove(actor);
    }


    public void mostrarActores(Actor actor){

        for (int i = 0; i <this.actor.size() ; i++) {
            System.out.println("actores de la pelicula" + this.titulo);
        }

    }

    @Override
    public String toString() {
        return "La Pelicula es" + this.titulo + "(" + this.anio + ")" ;
    }
}
