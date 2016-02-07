package giti7083.araceli.animal;

/**
 * * Declaracion de la clase Animal *
 * 
 * @author Araceli Colmenero * Ultima revision: Febrero 2016
 */
public abstract class Animal implements IAnimal { // Nombre de la clase
	public String nombre; // Atributo de la clase

	// Constructor
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	// Metodo tipoAnimal
	public void tipoAnimal() {

	}

	// Método que obtiene el valor del nombre
	public String getNombre() {
		return nombre;
	}

	// Método que obtiene el obtiene del nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
		System.out.println("El animal se llama:  " + this.nombre);
	}

}
