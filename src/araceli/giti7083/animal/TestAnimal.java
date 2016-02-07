package araceli.giti7083.animal;
/**
 * * Declaracion de la clase Test*
 * 
 * @author Araceli Colmenero * Ultima revision: Febrero 2016
 */
public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal;
		animal= new Leon();
		animal.dibuja();
		animal=new Pato();
		animal.dibuja();
		animal=new Elefante();
		animal.dibuja();

	}

}
