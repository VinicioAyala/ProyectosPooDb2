package uni1a;

public class Temporada {
	
	private String nombre;	
	private int episodios;
	
	public Temporada(String nombre,int episodios) {
		this.nombre = nombre;		
		this.episodios= episodios;
	}

	public String getNombre() {					return nombre;	}
	public void setNombre(String nombre) {		this.nombre = nombre;	}

	public int getEpisodios() {						return episodios;	}
	public void setEpisodios(int episodios) {		this.episodios = episodios;	}

	//mostrar detalles de la temporada
	public void mostrarDetalles() {
        System.out.println("-- Detalles de la Temporada --");
        System.out.println("Nombre de Temporada: " + getNombre());
        System.out.println("Total Capitulos:     " + getEpisodios());
        System.out.println();
    }	
	

}
