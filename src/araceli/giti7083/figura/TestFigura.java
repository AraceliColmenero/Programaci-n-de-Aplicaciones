package araceli.giti7083.figura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * * Declaracion de la clase Test *
 * 
 * @author Araceli Colmenero * Ultima revision: Febrero 2016
 */

public class TestFigura {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Figura figura = null;
		Scanner scaner = new Scanner(System.in);
		System.out.println("Teclea la Figura que deseas");
		System.out.println("Teclea 1: Cuadrado");
		System.out.println("Teclea 2: Circulo");
		int seleccion = scaner.nextInt();
		Double nu;
		int lado;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		switch (seleccion) {
		case 1:
			System.out.println("Escribe el valor del lado del cuadrado: ");
			lado = Integer.parseInt(in.readLine());
			figura = new Cuadrado(lado);
			break;
		case 2:
			System.out.println("Escribe el radio del circulo: ");
			nu = Double.parseDouble(in.readLine());
			figura = new Circulo(nu);

			break;

		default:
			break;
		}
		System.out.println("El área de la figura es: " + figura.area());

	}

}
