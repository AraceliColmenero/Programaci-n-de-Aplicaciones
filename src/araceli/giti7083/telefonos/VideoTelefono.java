package araceli.giti7083.telefonos;
/**
 * * Declaracion de la clase VideoTelefono *
 * 
 * @author Araceli Colmenero * Ultima revision: Febrero 2016
 */
public class VideoTelefono implements Telefono, VideoPlayer {
	public int marcarNumero(int numero){
		return numero;
	}
	public boolean  llamadaEnProceso(){
		return false;
	}
}
