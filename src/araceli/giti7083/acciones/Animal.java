package araceli.giti7083.acciones;
/**
 * * Declaracion de la clase Animal *
 * 
 * @author Araceli Colmenero * Ultima revision: Febrero 2016
 */
public abstract class Animal implements AccionesSeresVivos {
//Implementacion de métodos
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
	public void hablar() {
		// TODO Auto-generated method stub
		
	}
	

}
