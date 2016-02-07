package araceli.giti7083.interfacefigura;

import java.util.Scanner;

/**
 * * Declaracion de la clase Test *
 * 
 * @author Araceli Colmenero * Ultima revision: Febrero 2016
 */

public class TestInterface {

	// Método tes en el cual se crea la relacion de dependencia a las clases
	public void test() {
		Figura figura;
		// Circulo circulo;
		// Cuadrado cuadrado;
		// Triangulo triangulo;

		Scanner scaner = new Scanner(System.in);
		System.out.println("Teclea la Figura que deseas");
		int seleccion = scaner.nextInt();

		switch (seleccion) {
		case 1:
			figura = new Circulo();
			break;
		case 2:
			figura = new Cuadrado();
			break;
		case 3:
			figura = new Triangulo();
			break;
		default:
			break;
		}
	}

	public static void main(String[] args) {
		new TestInterface().test();

	}
}
