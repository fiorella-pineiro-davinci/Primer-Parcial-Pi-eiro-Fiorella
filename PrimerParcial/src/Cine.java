import java.util.ArrayList;

public class Cine {

    //ATRIBUTOS

    String nombre;
    String ciudad;
    ArrayList<Pelicula> pelicula = new ArrayList<Pelicula>();

    //CONSTRUCTORES

    public Cine(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public Cine(String nombre) {
        this.nombre = nombre;
    }

    //METODOS

    public void agregarPelicula(Pelicula pelicula){
        this.pelicula.add(pelicula);
    }


    public void eliminarPelicula(Pelicula pelicula){
        this.pelicula.remove(pelicula);
    }


    public void mostrarPelicula(Pelicula pelicula){
        for (int i = 0; i <this.pelicula.size() ; i++) {

            System.out.println("`Peliculas de la cartelera en nombre "+ this.nombre);
            
        }
    }

    @Override
    public String toString() {
        return "Bienvenido al cine" + this.nombre;
    }
}
