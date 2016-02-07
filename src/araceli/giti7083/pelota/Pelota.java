package araceli.giti7083.pelota;

/**
 * * Declaracion de la clase Pelota *
 * 
 * @author Araceli Colmenero * Ultima revision: Febrero 2016
 */
public abstract class Pelota implements Rebotable {

	private int Redondez;

	public Pelota() {

		// TODO Auto-generated constructor stub
	}

	// métodos que especifican la redondez
	public void setRedondez(int redondez) {
		Redondez = redondez;
	}
}
