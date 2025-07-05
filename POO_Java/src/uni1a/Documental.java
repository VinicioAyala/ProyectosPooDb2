/**
 * Class Documental
 */
package uni1a;

import java.util.ArrayList;
import java.util.List;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
    }    
    
    private List<Investigador> invest = new ArrayList<>(); //    

    public String getTema() {  return tema;    } // muestra el valor de la variable
    public void setTema(String tema) {  this.tema = tema;  }  //define o edita el valor de la variable
    
    
    public void agregarInvestigador(Investigador investigador) { 
    	invest.add(investigador);
        }    
    
    
    @Override
    public void mostrarDetalles() {
        System.out.println("<< Detalles del Documental >>");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);        
        System.out.println();
        for (Investigador investigador : getInvest()) {
        	investigador.mostrarDetalles();
        }        
        System.out.println();
    }
	
    
    public List<Investigador> getInvest() {		return invest;	}
   
    
}