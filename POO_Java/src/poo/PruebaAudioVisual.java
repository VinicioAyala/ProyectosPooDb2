package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("DEBER NUMERO 2");
        System.out.println();

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[3];
        
        
        Pelicula p = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
                 p.agregarActor(new Actor("D CAPRIO",60));
                 p.agregarActor(new Actor("WILL SMITH",55));
        
        SerieDeTV s = new SerieDeTV("Juego del Calamar", 60, "Terror", 3);
        		  s.agregarTemporada(new Temporada("Temporada 2",12));	
        
        
        contenidos[0] = p;
        contenidos[1] = s;
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");
        

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
            System.out.println();
        }
    }
}