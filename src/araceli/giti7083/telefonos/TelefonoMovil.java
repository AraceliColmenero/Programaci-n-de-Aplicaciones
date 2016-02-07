package araceli.giti7083.telefonos;
/**
 * * Declaracion de la clase Telefono Movil *
 * 
 * @author Araceli Colmenero * Ultima revision: Febrero 2016
 */
public class TelefonoMovil implements Telefono {
	public int marcarNumero(int numero){
		return numero;
        //Marca el número y mantiene la conexión
	}
	public boolean  llamadaEnProceso(){
		return false;
	}
}
