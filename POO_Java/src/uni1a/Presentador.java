package uni1a;

public class Presentador {
	
	private String nombre;
	private String ciudad;
	private int edad;
	
	public Presentador(String nombre, String ciudad , int edad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.edad = edad;		
	}

	public String getNombre() { return nombre;	}
	public void setNombre(String nombre) { this.nombre = nombre; }	
	
	public String getCiudad() {	return ciudad;	}
	public void setCiudad(String ciudad) {	this.ciudad = ciudad; }

	public int getEdad() { return edad;	}
	public void setEdad(int edad) {	this.edad = edad;	}

	//mostrar detalles del presentador
	public void mostrarDetalles() {
        System.out.println("... Detalles deL presentador ...");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Ciudad: " + getCiudad());
        System.out.println("Edad:   " + getEdad());
        System.out.println();
    }		

}
