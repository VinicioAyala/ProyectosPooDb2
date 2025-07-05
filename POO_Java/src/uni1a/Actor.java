package uni1a;

public class Actor {
	private String nombre;
	private int edad;
	
	public Actor(String nombre,int edad) {
		this.nombre = nombre;
		this.edad = edad;		
	}

	public String getNombre() { return nombre;	}

	public void setNombre(String nombre) { this.nombre = nombre; }

	
	public int getEdad() { return edad;	}

	public void setEdad(int edad) {	this.edad = edad;	}

	//mostrar detalles del actor
	public void mostrarDetalles() {
        System.out.println("Detalles deL actor");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println();
    }	
	
	
	
}
