package uni1a;

public class Contenido {
	
	private String tema;
	private int episodio;
	
	public Contenido(String tema,int episodio) {
		this.tema = tema;
		this.episodio = episodio;		
	}	

	public String getTema() {		return tema;	}
	public void setTema(String tema) {		this.tema = tema;	}

	public int getEpisodio() {		return episodio;	}
	public void setEpisodio(int episodio) {		this.episodio = episodio;	}

	//mostrar detalles del actor
	public void mostrarDetalles() {
        System.out.println("++ Detalles del Podcast ++");
        System.out.println("Tema: " + getTema());
        System.out.println("Episodio:   " + getEpisodio());
        System.out.println();
    }	
	

}
