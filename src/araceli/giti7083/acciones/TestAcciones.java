package araceli.giti7083.acciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * * Declaracion de la clase Test Acciones  *
 * 
 * @author Araceli Colmenero * Ultima revision: Febrero 2016
 */
public class TestAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = null;
		Humano h;
		Scanner scaner = new Scanner(System.in);
		System.out.println("Teclea la opcion para conocer las acciones que realizan: ");
		System.out.println("Teclea 1: Animal");
		System.out.println("Teclea 2: Humano");
		int seleccion = scaner.nextInt();
		

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		switch (seleccion) {
		case 1:
			a= new Animal() {
			};
			System.out.println("Las acciones propias de los animales son: ");
			a.alimentarse();
			a.desplazarse();
			a.dormir();
			a.jugar();
			
			break;
		case 2:
			h=new Humano() {
			};
			System.out.println("Las acciones propias de los humanos son: ");
			h.alimentarse();
			h.bailar();
			h.desplazarse();
			h.estudiar();
			h.hablar();
			h.jugar();
			h.trabajar();
			h.tocarIstrumento();
			
			
			break;

		default:
			break;
		}
	}

}
