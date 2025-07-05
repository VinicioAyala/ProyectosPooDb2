package uni1a;

public class Investigador {
	
	private String nombre;
	private int edad;
	
	public Investigador(String nombre,int edad) {
		this.nombre = nombre;
		this.edad = edad;		
	}

	public String getNombre() {			return nombre;	}
	public void setNombre(String nombre) {		this.nombre = nombre;	}

	public int getEdad() {		return edad;	}
	public void setEdad(int edad) {		this.edad = edad;	}


	// detalles del investigador
	public void mostrarDetalles() {
        System.out.println("<< Detalles deL Investigador >>");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad:   " + getEdad());
        System.out.println();
    }		

}
