package araceli.giti7083.figuras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * * Declaracion de la clase TestFigura *
 * 
 * @author Araceli Colmenero * Ultima revision: Febrero 2016
 */
public class TestFiguras {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Double nu;
		System.out.println("Escribe el radio del circulo: ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		nu = Double.parseDouble(in.readLine());
		Figura figura;
		figura = new Circulo(nu);
		System.out.println("El área del circulo es: " + figura.calcularArea());

		System.out.println("El perimetro del circulo es: " + figura.calcularPerimetro());

	}

}
