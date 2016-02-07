package araceli.giti7083.acciones;
/**
 * * Declaracion de la clase Humano*
 * 
 * @author Araceli Colmenero * Ultima revision: Febrero 2016
 */
public abstract class Humano  implements AccionesHumano, AccionesSeresVivos{

	//Implemntacion de métodos
	@Override
	public void hablar() {
		System.out.println("*Hablar");
		
	}

	@Override
	public void desplazarse() {
		System.out.println("*Desplazarse");
		
	}

	@Override
	public void jugar() {
		System.out.println("*Jugar");
		
	}

	@Override
	public void alimentarse() {
		System.out.println("*Alimentarse");
		
	}

	@Override
	public void dormir() {
		System.out.println("*Dormir");
		
	}

	@Override
	public void bailar() {
		System.out.println("*Bailar");
		
	}

	@Override
	public void tocarIstrumento() {
		System.out.println("*Tocar un Istrumento");
		
	}

	@Override
	public void estudiar() {
		System.out.println("*Estudiar");
		
	}

	@Override
	public void trabajar() {
		System.out.println("*Trabajar");
		
	}

}
