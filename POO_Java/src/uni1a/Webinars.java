package uni1a;

import java.util.ArrayList;
import java.util.List;

//Subclase Pelicula que extiende de ContenidoAudiovisual
public class Webinars extends ContenidoAudiovisual  {

	private String tema;
	
	public Webinars(String titulo, int duracionEnMinutos, String genero, String tema ) {
		super(titulo, duracionEnMinutos, genero);	
		this.tema=tema;
	}

	public String getTema() {		return tema;	}
	public void setTema(String tema) {		this.tema = tema;	}
	
	
	@Override
    public void mostrarDetalles() {
        System.out.println("... Detalles del Webinars ...");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + tema);
        System.out.println();
        
        System.out.println();
    }

	
	

}
