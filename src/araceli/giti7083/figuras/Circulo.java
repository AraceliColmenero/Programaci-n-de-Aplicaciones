package araceli.giti7083.figuras;

/**
 * * Declaracion de la clase Circulo que hereda de la clase abstracta figura *
 * 
 * @author Araceli Colmenero * Ultima revision: Febrero 2016
 */
public class Circulo extends Figura {
	private double radio = 0.0;
	private Punto centro = null;

	public Circulo(Double radio) {
		this.radio = radio;
		// TODO Auto-generated constructor stub
	}

	// Metodo heredados de la clase figura
	public double calcularPerimetro() {
		return Math.PI * this.radio * 2;
	}

	public double calcularArea() {

		return Math.PI * Math.pow(this.radio, 2);

	}

}
