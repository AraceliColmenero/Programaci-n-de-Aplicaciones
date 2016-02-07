package araceli.giti7083.pelota;

/**
 * * Declaracion de la clase Llanta *
 * 
 * @author Araceli Colmenero * Ultima revision: Febrero 2016
 */
public abstract class Llanta implements Rebotable {
	private int Redondez;

	// método que especifican la redondez
	public void setRedondez(int redondez) {
		Redondez = redondez;
	}
}
