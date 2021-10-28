public class Main {

    public static void main(String[] args) {

        Actor primerActor = new Actor("Fiorella","Pineiro", "Argentina",1980);
        Actor segundoActor = new Actor("Fiore","Pineiro", "Argentina",1980);
        Actor tercerActor = new Actor("Laura","Pineiro", "Argentina",1980);
        Actor cuartoActor = new Actor("Lau","Pineiro", "Argentina",1980);

        Pelicula primerPelicula = new Pelicula("Titanic", 120,2000 ,"Romance" );
        Pelicula segundaPelicula = new Pelicula("El Rey Leon", 120,2000 ,"Infantil" );

        Cine nuevoCine = new Cine( "Nuevo Cine","Buenos Aires");




    }

}
