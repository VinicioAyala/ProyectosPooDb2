package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[3];
        //contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        
        Pelicula p = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
                 p.agregarActor(new Actor("D CAPRIO",60));
                 p.agregarActor(new Actor("WILL SMITH",55));
        
        
        contenidos[0] = p;
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");
        

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}