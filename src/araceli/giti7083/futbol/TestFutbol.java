package araceli.giti7083.futbol;
/**
 * * Declaracion de la clase Test *
 * 
 * @author Araceli Colmenero * Ultima revision: Febrero 2016
 */
public class TestFutbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Futbolista f=new Futbolista() {
			
			@Override
			public void viajar() {
				// TODO Auto-generated method stub
				System.out.println("Los futbolistas viajan");

				
			}
			
			@Override
			public void jugarPartido() {
				// TODO Auto-generated method stub
				System.out.println("Los futbolistas juegan partidos");
				
			}
			
			@Override
			public void entrenar() {
				// TODO Auto-generated method stub
				System.out.println("Los futbolistas deben entrenar");
			}
			
			@Override
			public void concentrarse() {
				// TODO Auto-generated method stub
				System.out.println("Los futbolistas deben concentrarse");	
			}
		};
		f.concentrarse();
		f.entrenar();
		f.viajar();
		f.jugarPartido();
	}
	}
