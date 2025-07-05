package uni1a;

import java.util.ArrayList;
import java.util.List;

//Subclase Pelicula que extiende de ContenidoAudiovisual
public class Webinars extends ContenidoAudiovisual  {

	private String tema;
	
	private List<Presentador> expositor = new ArrayList<>(); //

	
	public Webinars(String titulo, int duracionEnMinutos, String genero, String tema ) {
		super(titulo, duracionEnMinutos, genero);	
		this.tema=tema;
	}	

	public String getTema() {		return tema;	}
	public void setTema(String tema) {		this.tema = tema;	}
	
	public void agregarPresentador(Presentador presentador) { //
	    expositor.add(presentador);
	    } 	
	
	
	@Override
    public void mostrarDetalles() {
        System.out.println("... Detalles del Webinars ...");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + tema);
        System.out.println();
        for (Presentador pres : getExpositor()) {//
            pres.mostrarDetalles();
        }//
        System.out.println();
    }

	
	public List<Presentador> getExpositor() {
		return expositor;
	}
	

}
