package araceli.giti7083.figura;

/**
 * * Declaracion de la clase Cuadrado *
 * 
 * @author Araceli Colmenero * Ultima revision: Febrero 2016
 */
public class Cuadrado extends Figura {

	private int lado;

	// Constructor
	public Cuadrado(int lado) {
		this.lado = lado;
		// TODO lado-generated constructor stub
	}

	// Método heredado de clase figura
	public double area() {
		double area;
		return area = lado * lado;

	}

}
