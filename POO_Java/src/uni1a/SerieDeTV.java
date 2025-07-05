/**
 * Class SerieDeTV
 */
package uni1a;
import java.util.ArrayList;
import java.util.List;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
    
    private List<Temporada> cap = new ArrayList<>(); //

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
    }

    public int getTemporadas() { return temporadas;    }
    public void setTemporadas(int temporadas) { this.temporadas = temporadas;    }
    
    
    public void agregarTemporada(Temporada tempo) { 
    	cap.add(tempo);
        }
    
   

	@Override
    public void mostrarDetalles() {
        System.out.println("-- Detalles de Serie Tv --");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + this.temporadas);
        System.out.println();
        for (Temporada temporad : getCap()) {
        	 temporad.mostrarDetalles();
        }
        System.out.println();
    }
	
	 
    public List<Temporada> getCap() { return cap; }
    
}