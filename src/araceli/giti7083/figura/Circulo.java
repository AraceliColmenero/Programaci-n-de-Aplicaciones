package araceli.giti7083.figura;

/**
 * * Declaracion de la clase Circulo *
 * 
 * @author Araceli Colmenero * Ultima revision: Febrero 2016
 */
public class Circulo extends Figura {
	private double radio;

	// Constructor con parametros
	public Circulo(Double radio) {
		this.radio = radio;
		// TODO Auto-generated constructor stub
	}

	// Método heredado de clase figura
	public double area() {
		double area;
		area = Math.PI * Math.pow(this.radio, 2);
		return area;
	}

}
