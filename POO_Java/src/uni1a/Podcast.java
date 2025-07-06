package uni1a;

import java.util.ArrayList;
import java.util.List;

public class Podcast extends ContenidoAudiovisual{
	
	private String formato; // audio o video
	
	 private List<Contenido> contenido = new ArrayList<>(); //
	
	public Podcast(String titulo, int duracionEnMinutos, String genero, String formato) {
        super(titulo, duracionEnMinutos, genero);
        this.formato = formato;
    }

	public String getFormato() {		return formato;	}
	public void setFormato(String formato) {		this.formato = formato;	}
	
	
	public void agregarContenido(Contenido conten) { //
		contenido.add(conten);
	    } 
	
	
	 @Override
	    public void mostrarDetalles() {
	        System.out.println("++ Detalles del Podcast ++");
	        System.out.println("ID: " + getId());
	        System.out.println("Título: " + getTitulo());
	        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
	        System.out.println("Género: " + getGenero());
	        System.out.println("Tipo: " + formato);
	        for (Contenido cont : getContenido()) {//
	            cont.mostrarDetalles();
	        }//
	        System.out.println();
	        
	        System.out.println();
	    }

	 public List<Contenido> getContenido() {
		 return contenido;
	 }
	 
	 

}
