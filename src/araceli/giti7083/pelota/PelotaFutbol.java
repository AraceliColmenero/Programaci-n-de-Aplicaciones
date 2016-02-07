package araceli.giti7083.pelota;

/**
 * * Declaracion de la clase Pelota de futbol *
 * 
 * @author Araceli Colmenero * Ultima revision: Febrero 2016
 */
public class PelotaFutbol extends Pelota {
	int factorRebote;

	public PelotaFutbol() {
		System.out.println("La pelota es de futbol");
		// TODO Auto-generated constructor stub
	}

	// método que especifican el comportamiento al rebotar
	public void rebotar() {

	}

	// métodos que especifican el factor de rebote
	public void setFactorRebote(int factorRebote) {
		this.factorRebote = factorRebote;
	}
}
