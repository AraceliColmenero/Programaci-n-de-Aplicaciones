package giti7083.araceli.animal;

/**   *  Declaracion de la clase Test  * 
 *  @author Araceli Colmenero  *  
 *  Ultima revision: Febrero 2016  */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {
	public static InputStreamReader Leer = new InputStreamReader(System.in);
	public static BufferedReader Teclado = new BufferedReader(Leer);

	public void test() throws IOException {
		Animal animal;

		Scanner scaner = new Scanner(System.in);
		System.out.println("Que mascota tienes");
		System.out.println("Teclea 1: Gato");
		System.out.println("Teclea 2: Perro");
		int seleccion = scaner.nextInt();
		System.out.println("Cual es el nombre de tu mascota");
		String nom = Teclado.readLine();

		switch (seleccion) {
		case 1:
			animal = new Gato() {

				@Override
				public void comunicarse() {
					// TODO Auto-generated method stub

				}
			};
			animal.setNombre(nom);
			break;
		case 2:
			animal = new Perro() {

				@Override
				public void comunicarse() {
					// TODO Auto-generated method stub

				}
			};
			animal.setNombre(nom);
			break;

		default:
			break;
		}
	}

	// Método main
	public static void main(String[] args) throws IOException {

		new Test().test();

	}
}
