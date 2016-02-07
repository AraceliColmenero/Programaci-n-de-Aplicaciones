package araceli.giti7083.mascota;
/**
 * * Declaracion de la clase Test
 * @author Araceli Colmenero * Ultima revision: Febrero 2016
 */
public class TestMascota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Leon a= new Leon() {
			
			@Override
			public void comer() {
				System.out.println("El leon come carne");	
				
				
			}
		};
		a.rugir();
		a.comer();
	
	}

}
